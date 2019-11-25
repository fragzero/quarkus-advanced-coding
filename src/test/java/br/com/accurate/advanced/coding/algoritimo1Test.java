package br.com.accurate.advanced.coding;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class algoritimo1Test {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/algoritimo1/24/9")
          .then()
             .statusCode(200)
             .body(is("3"));
    }

}