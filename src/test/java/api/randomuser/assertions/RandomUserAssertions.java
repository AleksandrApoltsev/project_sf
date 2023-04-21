package api.randomuser.assertions;

import api.randomuser.dto.ResultsModel;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomUserAssertions {

    public static void checkResponseRandomUser(ResultsModel response, Map<String, String> queryParam) {

        assertThat(response).as("response не должен быть пустым").isNotNull();
        assertThat(response.getResults().get(0).getGender()).as("gender").isEqualTo(queryParam.get("gender"));
        assertThat(response.getResults().get(0).getNat()).as("nat").isEqualTo(queryParam.get("nat"));
    }
}
