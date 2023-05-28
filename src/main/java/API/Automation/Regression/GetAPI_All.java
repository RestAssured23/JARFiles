package API.Automation.Regression;

import API.Automation.Payload;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import API.Automation.Login.ExcelData;
import API.Automation.Pojo.HoldingProfile;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetAPI_All {
    RequestSpecification req = new RequestSpecBuilder()
            //      .setBaseUri(BaseURL)
            .addHeader("x-api-version", "2.0")
            .addHeader("channel-id", "12")
            .addHeader("x-fi-access-token", ExcelData.Regression())
            .setContentType(ContentType.JSON).build();
    ResponseSpecification respec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(ContentType.JSON).build();

    String Holdingid;    String InvestorId;

    public GetAPI_All() throws IOException {

    }

    @Test
    public void Feature() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL);
        res.when().get("/core/features")
                .then().log().all().spec(respec).extract().response().asString();
    }

    @Test
    public void User_Profile() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL);
        res.when().get("/core/user-profile")
                .then().log().all().spec(respec);
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
            else{
                Holdingid="0";
            }
        }
    }

    @Test(priority = 1)
    public void Systematic_plan() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/systematic-plan/sips")
                .then().log().all().spec(respec);
    }

    @Test(priority = 1)
    public void Dashboard() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/dashboard")
                .then().log().all().spec(respec);
    }

    @Test(priority = 1)
    public void Current_SIPS() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/current-sips")
                .then().log().all().spec(respec);
    }

    @Test(priority = 1)
    public void Invested_Schemes() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", "0");
        res.when().get("/core/investor/invested-schemes")
                .then().log().all().spec(respec);
    }
    @Test(priority = 1)
    public void Recent_Transactions() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/recent-transactions")
                .then().log().all().spec(respec);
    }

    @Test(priority = 1)
    public void STP() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid)
                .queryParam("page", "1")
                .queryParam("size", "50");
        res.when().get("/core/investor/current-stps")
                .then().log().all().spec(respec);
    }
    @Test(priority = 1)
    public void Power_STPs() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL);
        res.when().get("/core/investor/power-stps")
                .then().log().all().spec(respec);
    }
    @Test(priority = 1)
    public void Triggers() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/current-triggers")
                .then().log().all().spec(respec);
    }

    @Test(priority = 1)
    public void SWP() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid)
                .queryParam("page", "1")
                .queryParam("size", "50");

        res.when().get("/core/investor/current-swps")
                .then().log().all().spec(respec);
    }
    @Test(priority = 1)
    public void Folio_Banklist() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/folio-bank-list")
                .then().log().all().spec(respec);
    }
    @Test(priority = 1)
    public void Contact_Info() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL);
        res.when().get("/core/investor/contacts")
                .then().log().all().spec(respec);
    }
    @Test(priority = 1)
    public void Transactions_Authorization() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/transactions/authorization")
                .then().log().all().spec(respec);
    }
    @Test(priority = 1)
    public void Pending_Payments() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/investor/pending-payments")
                .then().log().all().spec(respec);
    }
    @Test
    public void Investor_Goals() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL);
        res.when().get("/core/goals")
                .then().log().all().spec(respec);
    }
    @Test
    public void Investor_Goal_Holding() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", "0");
        res.when().get("/core/investor/goals")
                .then().log().all().spec(respec);
    }
    @Test
    public void product_search_mf_form() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("holdingProfileId", Holdingid);
        res.when().get("/core/product-search/mf/form")
                .then().log().all().spec(respec);
    }
    @Test
    public void Announcements() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL);
        res.when().get("/core/user/sign-up/announcements")
                .then().log().all().spec(respec);
    }
    @Test
    public void lookup() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("types", "Location");  //State,Location,country,fd_nominee_salutation
        res.when().get("/core/lookups")
                .then().log().all().spec(respec);
    }
    @Test
    public void ProductSearch_MF_Form() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(Payload.product_Search());
        res.when().post("/core/product-search/mf")
                .then().log().all().statusCode(200);
    }
    @Test
    public void Super_Savings() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(Payload.Super_Savings());
        res.when().post("/core/product-search/mf")
                .then().log().all().statusCode(200);
    }
    @Test
    public void NFO_Search() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(Payload.NFO());
        res.when().post("/core/product-search/mf")
                .then().log().all().statusCode(200);
    }
    @Test(priority = 1)
    public void Scheme_info() //Scheme_Info
    {
        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("holdingProfileId", "0");
        payload.put("showZeroHoldings", true);
        Map<String, Object> sort = new HashMap<String, Object>();
        sort.put("by", "investment_amount");

        sort.put("type", "desc");                //desc , asc
        payload.put("sort", sort);
        payload.put("type", "portfolio");        //	portfolio, scheme_info, asset, tax

        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(payload);
        res.when().post("/core/investor/dashboard/portfolio")
                .then().log().all().spec(respec);
    }
    //Asset Allocation
    @Test
    public void Dashboard_portfolio_Allocation_Asset_All() {
        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("holdingProfileId", "0");
        payload.put("portfolioId", "0");
        payload.put("detailType", "asset");
        payload.put("duration", "three_month");

        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(payload);
        res.when().post("/core/investor/dashboard/portfolio/allocations")
                .then().log().all().spec(respec).extract().response().asString();
    }
    @Test
    public void MF_Scheme() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .queryParam("schemeCodes",876)
                .queryParam("page",1)
                .queryParam("size",10);
        res.when().get("/core/product-search/mf/schemes")
                .then().log().all().spec(respec);
    }
    @Test
    public void Dashboard_portfolio_Allocation_category() {
        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("holdingProfileId", "0");
        payload.put("portfolioId", "0");
        payload.put("detailType", "category");
        payload.put("duration", "three_month");
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(payload);
        res.when().post("/core/investor/dashboard/portfolio/allocations")
                .then().log().all().spec(respec).extract().response().asString();
    }
    @Test
    public void Dashboard_portfolio_Allocation_fi_style() {
        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("holdingProfileId", "0");
        payload.put("portfolioId", "0");
        payload.put("detailType", "fi_style");
        payload.put("duration", "three_month");
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(payload);
        res.when().post("/core/investor/dashboard/portfolio/allocations")
                .then().log().all().spec(respec).extract().response().asString();
    }
    @Test
    public void Dashboard_portfolio_Allocation_credit() {
        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("holdingProfileId", "0");
        payload.put("portfolioId", "0");
        payload.put("detailType", "credit_quality");
        payload.put("duration", "three_month");
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(payload);

        res.when().post("/core/investor/dashboard/portfolio/allocations")
                .then().log().all().spec(respec).extract().response().asString();
    }
    @Test
    public void Select_Funds() {
        RequestSpecification res = given().log().all().spec(req).baseUri(ExcelData.BaseURL)
                .body(Payload.Select_Funds());
        res.when().post("/core/product-search/mf/select-funds")
                .then().log().all().statusCode(200);
    }


}
