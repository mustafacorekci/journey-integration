package clients;

import io.restassured.response.Response;
import base.BaseTest;
import models.User;

import static io.restassured.RestAssured.given;

public class UserClient extends BaseClient {

    public Response getUserById(int id) {
        return sendRequest("GET", "/users/" + id);
    }

    public Response createUser(User user) {
        return given().spec(BaseTest.requestSpec)
                .body(user)
                .when().post("/users")
                .then().extract().response();
    }
}

