package ui.test_data;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestData {
    Faker faker = new Faker(new Locale("en"));
    private String firstName = faker.name().firstName();
    private String lastName = faker.name().lastName();
    private String email = faker.internet().emailAddress();
    private String gender = faker.demographic().sex();
    private String number = faker.phoneNumber().subscriberNumber(10);
    private String day = String.valueOf(faker.number().numberBetween(10, 30));
    private String month = "June";
    private String year = String.valueOf(faker.number().numberBetween(1900, 2010));
    private String subjects = "English";
    private String hobbies = "Sports";
    private String picture = "1.jpg";
    private String address = faker.address().fullAddress();
    private String state = "NCR";
    private String city = "Delhi";

}