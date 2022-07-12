package com.alticci.api.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AlticciResourceTest {

    @Test
    public void testapplyAlticc() {
        given()
          .when().get("/alticci/10")
          .then()
             .statusCode(200)
             .body(is("9"));

        given()
            .when().get("/alticci/0")
            .then()
                .statusCode(200)
                .body(is("0"));

        given()
            .when().get("/alticci/1")
            .then()
                .statusCode(200)
                .body(is("1"));
        
        given()
            .when().get("/alticci/2")
            .then()
                .statusCode(200)
                .body(is("1"));
    }
}