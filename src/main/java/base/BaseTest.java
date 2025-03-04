package base;

import config.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    public static RequestSpecification requestSpec;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = ConfigManager.getInstance().get("base.url");
        requestSpec = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }
}

