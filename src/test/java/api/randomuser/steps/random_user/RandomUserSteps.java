package api.randomuser.steps.random_user;

import api.randomuser.steps.CommonSteps;
import io.qameta.allure.Step;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RandomUserSteps extends CommonSteps {

    @Step
    public <T> T getRandomUserApi(Map<String, String> queryParam, Class<T> tClass) {

        return given()
                .log().uri()
                .queryParams(queryParam)
                .when()
                .get("https://randomuser.me/api/")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(tClass);
    }
}
