package org.francescomagarotto

import io.quarkus.test.junit.QuarkusTest
import io.quarkus.test.junit.TestProfile
import io.restassured.RestAssured.given
import org.junit.jupiter.api.Test

@QuarkusTest
@TestProfile(TestConfiguration::class)
class PetResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
            .`when`().get("/pets")
            .then()
            .statusCode(200)
        //    .body(Matchers.arrayWithSize(3))
        //.body(`is`("Hello RESTEasy"))
    }

}