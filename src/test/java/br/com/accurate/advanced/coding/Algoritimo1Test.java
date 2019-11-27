package br.com.accurate.advanced.coding;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class Algoritimo1Test {

    @Test
    void testAlgoritimoUmEndpoint() {
        given()
          .when().get("/algoritimo-um/mdc/24/9")
          .then()
             .statusCode(200)
             .body(is("0"));
    }

}