package api.randomuser.test_data;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Map;
import java.util.stream.Stream;

public class RandomUserTestData {

    public static Stream<Arguments> checkGenderRandomUser() {
        var queryParam = Map.of("gender", "female", "nat", "US");
        var queryParam1 = Map.of("gender", "male", "nat", "BR");

        return Stream.of(Arguments.of(queryParam));
    }
}

