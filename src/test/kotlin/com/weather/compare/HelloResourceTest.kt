package com.weather.compare

import io.restassured.RestAssured.given
import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test

internal class HelloResourceTest {
    @Test
    fun helloRespondsWithPassedName() {
        given()
            .param("name", "Jane")
            .`when`()["/hello"]
            .then()
            .statusCode(200)
            .body(containsString("Hello, Jane!"))
    }
}
