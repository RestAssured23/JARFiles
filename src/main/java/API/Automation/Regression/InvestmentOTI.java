package API.Automation.Regression;

import API.Automation.DBConnectiion.DBconnection;
import API.Automation.Login.ExcelData;
import API.Automation.Pojo.HoldingProfile;
import API.Automation.Pojo.MFSearchForm;
import API.Automation.Pojo.OTP.CommonOTP;
import API.Automation.Pojo.PortfolioDashboard;
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

public class InvestmentOTI {
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
    String Scheme_code, Scheme_Name,Scheme_Option;

    public InvestmentOTI() throws IOException {
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
    public void Dashboard_portfolio() {
        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("holdingProfileId", Holdingid);
        payload.put("showZeroHoldings", true);
        Map<String, Object> sort = new HashMap<String, Object>();
        sort.put("by", "investment_amount");
        sort.put("type", "desc");
        payload.put("sort", sort);
        payload.put("type", "portfolio");
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(payload);
        PortfolioDashboard.Root response = res.when().post("/core/investor/dashboard/portfolio")
                .then().log().all().spec(respec).extract().response().as(PortfolioDashboard.Root.class);
        for (int i = 0; i < response.getData().size(); i++) {
            if (response.getData().get(i).getName().equalsIgnoreCase(ExcelData.Goal_Name)) {
                Goal_ID = response.getData().get(i).getId();
                System.out.println("Goal ID :" + Goal_ID);
            }
        }
    }
    @Test
    public void product_search_mf_form() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body("{\n" +
                        "  \"page\": 1,\n" +
                        "  \"size\": 10,\n" +
                        "  \"orderBy\": \"rating\",\n" +
                        "  \"orderType\": \"DESC\",\n" +
                        "  \"categories\": [],\n" +
                        "  \"subCategories\": [],\n" +
                        "  \"query\": \""+ExcelData.SchemeSearch+"\",\n" +
                        "  \"risk\": [],\n" +
                        "  \"ratings\": [],\n" +
                        "  \"amcs\": [],\n" +
                        "  \"searchCode\": [\n" +
                        "    {\n" +
                        "      \"value\": \"\",\n" +
                        "      \"sort\": true\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"oti\": true\n" +
                        "}");
        MFSearchForm.Root response= res.when().post("/core/product-search/mf")
                .then().log().all().spec(respec).extract().response().as(MFSearchForm.Root.class);
       for(int i=0;i<response.getData().getContent().size();i++){
           if(response.getData().getContent().get(i).getName().equalsIgnoreCase(ExcelData.Expected_Scheme)){
              Scheme_Name=response.getData().getContent().get(i).getName();
           Scheme_code=response.getData().getContent().get(i).getSchemeCode();
            Scheme_Option=response.getData().getContent().get(i).getOption();
       }
    }
    }
    @Test(priority = 2)
    public void Investor_Cart() {
        Map<String,Object> Payload=new LinkedHashMap<String,Object>();
        Payload.put("product","MF");
        Payload.put("id","");
        Map<String,Object> info=new HashMap<String,Object>();
            info.put("os","Web-FI");
            info.put("fcmId","");
        Payload.put("appInfo",info);
        Payload.put("holdingProfileId",Holdingid);
        Map<String,Object> oti=new LinkedHashMap<String,Object>();
            oti.put("totalAmount",ExcelData.Inv_Amount);
            oti.put("investmentType","oti");
            oti.put("paymentId","");
        List<Map<String, Object>> Schemelist = new LinkedList<Map<String, Object>>();
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("dividendOption","Payout");
            data.put("folio","-");
            data.put("bankId","1");
            data.put("payment",true);
            data.put("option",Scheme_Option);
            data.put("goalId",Goal_ID);
            data.put("schemeCode",Scheme_code);
            data.put("schemeName",Scheme_Name);
            data.put("amount",ExcelData.Inv_Amount);
            data.put("sipType","");
            data.put("sipDate",0);
        Schemelist.add(data);
        oti.put("schemes",Schemelist);
        Map<String,Object> investment=new LinkedHashMap<String,Object>();
        investment.put("oti",oti);
        Payload.put("mf",investment);

        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(Payload);
        AddScheme.Root response=res.when().post("/core/investor/cart")
                .then().log().all().spec(respec).extract().response().as(AddScheme.Root.class);
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
    public void dbconnection() throws SQLException {
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
