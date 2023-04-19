package api.randomuser.steps;

import api.randomuser.dto.ResultsModel;
import io.qameta.allure.Step;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RandomUserSteps extends CommonSteps {

    @Step
    public ResultsModel getRandomUserApi(Map<String, String> queryParam) {

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
                .as(ResultsModel.class);
    }
}
