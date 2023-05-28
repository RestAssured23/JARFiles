package API.Automation;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Base_URL {
    public static String dev="https://dev-api.fundsindia.com";    public static String test="https://testapi.fundsindia.com";
    public static String scrum1 = "https://scrum-api.fundsindia.com";
    public static String scrum2 = "https://scrum2-api.fundsindia.com";
    public static String scrum3 = "https://scrum3-api.fundsindia.com";
    public static String scrum4 = "https://scrum4-api.fundsindia.com";
    public static String staging = "https://staging-api.fundsindia.com";
    public static String live = "https://api.fundsindia.com";
    public static String hotfix = "https://hotfix-api.fundsindia.com";

    static RequestSpecification req = new RequestSpecBuilder()
            .setBaseUri(dev)
            .addHeader("x-api-version", "2.0")
            .addHeader("channel-id", "10")
            //   .addHeader("x-fi-access-token", Login.Regression())
            .setContentType(ContentType.JSON).build();
    static ResponseSpecification respec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(ContentType.JSON).build();

}
