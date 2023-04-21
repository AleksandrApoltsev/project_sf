package api.randomuser.test_data;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Map;
import java.util.stream.Stream;

public class RandomUserTestData {

    public static Stream<Arguments> checkRandomUser() {
        return Stream.of(
                Arguments.of(Map.of("gender", "female", "nat", "US")),
                Arguments.of(Map.of("gender", "male", "nat", "BR")));
    }
}

