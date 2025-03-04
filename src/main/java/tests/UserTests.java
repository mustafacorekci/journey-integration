package tests;

import base.BaseTest;
import clients.UserClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTests extends BaseTest {
    private final UserClient userClient = new UserClient();

    @Test
    public void testGetUserById() {
        Response response = userClient.getUserById(1);
        assertEquals(200, response.getStatusCode());
    }
}

