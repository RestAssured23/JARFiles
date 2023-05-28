package API.Automation.Login;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import API.Automation.Pojo.Signin;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Cred {

    public static String dev="https://dev-api.fundsindia.com";    public static String test="https://testapi.fundsindia.com";
    public static String scrum1 = "https://scrum-api.fundsindia.com";
    public static String scrum2 = "https://scrum2-api.fundsindia.com";
    public static String scrum3 = "https://scrum3-api.fundsindia.com";
    public static String scrum4 = "https://scrum4-api.fundsindia.com";
    public static String staging = "https://staging-api.fundsindia.com";
    public static String live = "https://api.fundsindia.com";
    public static String hotfix = "https://hotfix-api.fundsindia.com";

    static RequestSpecification req =new RequestSpecBuilder()
            .setBaseUri(staging)
            .addHeader("x-api-version","2.0")
            .addHeader("channel-id","10")
            .setContentType(ContentType.JSON).build();
    static ResponseSpecification respec =new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(ContentType.JSON).build();
    @Test
    public static String Regression()
    {
        HashMap<String, String> login = new HashMap<String, String>();
        login.put("emailId", "Regression@gmail.com");        login.put("password", "asdfasdf12");
        login.put("grantType", "credentials");               login.put("refreshToken", "string");

        RequestSpecification res=given().spec(req)
                .body(login);
        Signin.Root response =res.when().post("/core/auth/sign-in")
                .then().spec(respec).extract().response().as(Signin.Root.class);
        return response.getData().getAccessToken();

    }
    @Test
    public static String Sathish()
    {
        HashMap<String, String> login = new HashMap<String, String>();
        login.put("emailId", "sathi@gmail.com");        login.put("password", "asdfasdf12");
        login.put("grantType", "credentials");               login.put("refreshToken", "string");

        RequestSpecification res=given().spec(req)
                .body(login);
        Signin.Root response =res.when().post("/core/auth/sign-in")
                .then().spec(respec).extract().response().as(Signin.Root.class);
        return response.getData().getAccessToken();

    }
    @Test
    public static String saravan()
    {
        HashMap<String, String> login = new HashMap<String, String>();
        login.put("emailId", "saravan0989@gmail.com");        login.put("password", "Sara_1689");
        login.put("grantType", "credentials");               login.put("refreshToken", "string");

        RequestSpecification res=given().spec(req)
                .body(login);
        Signin.Root response =res.when().post("/core/auth/sign-in")
                .then().spec(respec).extract().response().as(Signin.Root.class);
        return response.getData().getAccessToken();

    }
}
