package clients;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import base.BaseTest;

public abstract class BaseClient {

    protected Response sendRequest(String method, String endpoint) {
        return given().spec(BaseTest.requestSpec)
                .when().request(method, endpoint)
                .then().extract().response();
    }
}

