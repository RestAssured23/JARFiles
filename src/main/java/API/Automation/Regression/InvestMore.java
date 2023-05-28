package API.Automation.Regression;

import API.Automation.DBConnectiion.DBconnection;
import API.Automation.Login.ExcelData;
import API.Automation.Pojo.HoldingProfile;
import API.Automation.Pojo.InvestedScheme;
import API.Automation.Pojo.OTP.CommonOTP;
import API.Automation.Pojo.TwoFA.AddScheme;
import API.Automation.Pojo.TwoFA.GetCart;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import static io.restassured.RestAssured.given;

public class InvestMore {


    RequestSpecification req = new RequestSpecBuilder()
     //                  .setBaseUri(ExcelData.BaseURL)
            .addHeader("x-api-version", "2.0")
            .addHeader("channel-id", "12")
            .addHeader("x-fi-access-token", ExcelData.Regression())
            .setContentType(ContentType.JSON).build();
    ResponseSpecification respec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(ContentType.JSON).build();

    String Holdingid, InvestorId, Folio, otprefid, DB_Otp, DB_refid,Bankid,Goal_ID,Option,CartId,GroupId;
    String Scheme_code, Scheme_Name;

    public InvestMore() throws IOException {
    }
    @Test
    public void Holding_Profile() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL);
        HoldingProfile.Root hold_response = res.when().get("/core/investor/holding-profiles")
                .then().log().all().spec(respec).extract().response().as(HoldingProfile.Root.class);
        int size = hold_response.getData().size();  // Data Size
        for (int i = 0; i < size; i++) {
            if(hold_response.getData().get(i).getHoldingProfileId().equalsIgnoreCase(ExcelData.HoldID)){
                Holdingid = hold_response.getData().get(i).getHoldingProfileId();
                System.out.println("Holding ID :" + Holdingid);
                for(int j=0;j<hold_response.getData().get(i).getInvestors().size();j++){
                    InvestorId = hold_response.getData().get(i).getInvestors().get(j).getInvestorId();
                    System.out.println("Investor ID : " + InvestorId);
                }
            }
        }
    }
    @Test(priority = 1)
    public void InvestedScheme_API() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", ExcelData.HoldID);
        InvestedScheme.Root response = res.when().get("/core/investor/invested-schemes")
                .then().log().all().spec(respec).extract().response().as(InvestedScheme.Root.class);
        int count = response.getData().size();
        for (int i = 0; i < count; i++) {
             if(response.getData().get(i).getFolio().equalsIgnoreCase(ExcelData.FolioID)){
                Scheme_Name=response.getData().get(i).getSchemeName();
                Scheme_code=response.getData().get(i).getSchemeCode();
                Folio=response.getData().get(i).getFolio();
                Bankid=response.getData().get(i).getBankId();
                Goal_ID=response.getData().get(i).getGoalId();
                Option=response.getData().get(i).getOption();
                 System.out.println("Scheme_Name:"+Scheme_Name+"\n"
                         +"Scheme_Code:"+Scheme_code+"\n"
                         +"Folio:"+Folio+"\n"
                         +"Goal_ID:"+Goal_ID+"\n"
                         +"Option:"+Option);
            }
        }
    }
    @Test(priority = 2)
    public void Investor_Cart() {
        Map<String,Object> Payload_Growth=new LinkedHashMap<String,Object>();
        Payload_Growth.put("product","MF");
        Payload_Growth.put("id","");
        Map<String,Object> info=new HashMap<String,Object>();
        info.put("os","Web-FI");
        info.put("fcmId","");
        Payload_Growth.put("appInfo",info);
        Payload_Growth.put("holdingProfileId",Holdingid);
        Map<String,Object> oti=new LinkedHashMap<String,Object>();
        oti.put("totalAmount",ExcelData.Inv_Amount);
        oti.put("investmentType","oti");
        oti.put("paymentId","");
        List<Map<String, Object>> Scheme_List = new LinkedList<Map<String, Object>>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("dividendOption","Payout");
        data.put("folio",Folio);
        data.put("bankId",Bankid);
        data.put("payment",true);
        data.put("option",Option);
        data.put("goalId",Goal_ID);
        data.put("schemeCode",Scheme_code);
        data.put("schemeName",Scheme_Name);
        data.put("amount",1000);
        data.put("sipType","");
        data.put("sipDate",0);
        Scheme_List.add(data);
        oti.put("schemes",Scheme_List);
        Map<String,Object> investment=new LinkedHashMap<String,Object>();
        investment.put("oti",oti);
        Payload_Growth.put("mf",investment);

        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(Payload_Growth).log().body();
        AddScheme.Root response=res.when().post("/core/investor/cart")
                .then().log().body().spec(respec).extract().response().as(AddScheme.Root.class);
        CartId= response.getData().getCartId();
        System.out.println(CartId);
    }

    @Test(priority = 3)
    public void Folio_Group_ID() {
        RequestSpecification getres = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("cartId", CartId);
        GetCart.Root response = getres.when().get("/core/investor/cart/folio-groups")
                .then().log().all().spec(respec).extract().response().as(GetCart.Root.class);
        GroupId = response.getData().getGroups().get(0).getGroupId();
        System.out.println(GroupId);
    }
    @Test(priority = 4)
    public void Common_Otp() {
        Map<String, Object> otppayload = new HashMap<String, Object>();
        otppayload.put("type", "mobile_and_email");
        otppayload.put("idType", "folio_group_id");
        otppayload.put("referenceId", GroupId);
        otppayload.put("workflow", "sip_oti_2fa");

        RequestSpecification otpres = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(otppayload);
        CommonOTP.Root response = otpres.when().post("/core/investor/common/otp")
                .then().log().all().spec(respec).extract().response().as(CommonOTP.Root.class);
        otprefid = response.getData().getOtpReferenceId();
        System.out.println(otprefid);
    }
    @Test(priority = 5)
    public void DB_Connection() throws SQLException {
        // DB connection
        Statement s1 = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            DBconnection ds = new DBconnection();
            con = ds.getConnection();
            s1 = con.createStatement();
            rs = s1.executeQuery("select TOP 5* from dbo.OTP_GEN_VERIFICATION ogv where referenceId ='" + otprefid + "'");
            rs.next();
            DB_Otp = rs.getString("otp");
            DB_refid = rs.getString("referenceid");
            System.out.println("OTP :" + DB_Otp);
            System.out.println("OTPReferenceID :" + DB_refid);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (s1 != null) s1.close();
            if (rs != null) rs.close();
            if (con != null) con.close();
        }
    }
    @Test(priority = 6)
    public void OTP_Verify() {
        Map<String, Object> payload1 = new HashMap<String, Object>();
        Map<String, Object> payload2 = new HashMap<String, Object>();
        payload2.put("email", "");
        payload2.put("sms", "");
        payload2.put("email_or_sms", DB_Otp);
        payload1.put("otp", payload2);
        payload1.put("otpReferenceId", DB_refid);
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(payload1);
        res.when().post("/core/investor/common/otp/verify")
                .then().log().all().spec(respec);
    }
    @Test(priority = 7)
    public void Buy_Cart() {
        RequestSpecification buyres = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("cartId", CartId);
        buyres.when().get("/core/investor/cart/buy")
                .then().log().all().spec(respec);
    }

}

