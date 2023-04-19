package api.randomuser.test;

import api.randomuser.dto.ResultsModel;
import api.randomuser.extension.StepsExtension;
import api.randomuser.steps.RandomUserSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(StepsExtension.class)
public class RandomUserTest {

    @ParameterizedTest
    @MethodSource("api.randomuser.test_data.RandomUserTestData#checkGenderRandomUser")
    @DisplayName("Проверка вывода рандомного пользователя")
    void checkGenderRandomUser(
            Map<String, String> queryParam,
            RandomUserSteps steps
    ) {
        var response1 = steps.getRandomUserApi(queryParam).getInfo();

        assertThat(response1).as("response").isNotNull();

    }
}
