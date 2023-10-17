package steps;

import static io.restassured.RestAssured.given;

public class APISteps {

    public void getUserList(){
        given()
                .baseUri("https://reqres.io")
                .when()
                .get("/api/users?page=2")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
