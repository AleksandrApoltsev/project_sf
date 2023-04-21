package api.randomuser.test.random_user;

import api.randomuser.dto.ResultsModel;
import api.randomuser.steps.random_user.RandomUserSteps;
import api.randomuser.test.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;

import static api.randomuser.assertions.RandomUserAssertions.checkResponseRandomUser;
@DisplayName("Тестирование RandomUser")
public class RandomUserTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("api.randomuser.test_data.RandomUserTestData#checkRandomUser")
    @DisplayName("Проверка вывода рандомного пользователя")
    void checkRandomUser(Map<String, String> queryParam,
                         RandomUserSteps steps)
    {
        var response = steps.getRandomUserApi(queryParam, ResultsModel.class);
        checkResponseRandomUser(response,queryParam);
    }
}
