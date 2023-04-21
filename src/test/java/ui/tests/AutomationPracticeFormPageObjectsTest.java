package ui.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.TestBase;
import ui.pages.FormPage;
import ui.test_data.TestData;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@DisplayName("Тест")
public class AutomationPracticeFormPageObjectsTest extends TestBase {
    FormPage formPage = new FormPage();
    TestData testData = new TestData();

    @Test
    @Owner("Апольцев АС")
    @DisplayName("Проверка формы")
    @Severity(NORMAL)
    void formTest() {
        step("Открываем страницу с формой, вводим тестовые данные", () ->
                formPage.openPage()
                        .setFirstName(testData.getFirstName())
                        .setLastName(testData.getLastName())
                        .setUserEmail(testData.getEmail())
                        .setGender(testData.getGender())
                        .setUserNumber(testData.getNumber())
                        .setBirthDay(testData.getDay(), testData.getMonth(), testData.getYear())
                        .setSubjects(testData.getSubjects())
                        .setHobbiesWrapper(testData.getHobbies())
                        .setUploadPicture(testData.getPicture())
                        .setCurrentAddress(testData.getAddress())
                        .setState(testData.getState())
                        .setCity(testData.getCity())
                        .setSubmit());

        step("Проверка ввода тестовых данных", () ->
                formPage.checkResultsTableVisible()
                        .checkResult("Student Name", testData.getFirstName() + " " + testData.getLastName())
                        .checkResult("Student Email", testData.getEmail())
                        .checkResult("Gender", testData.getGender())
                        .checkResult("Mobile", testData.getNumber())
                        .checkResult("Date of Birth", testData.getDay() + " " + testData.getMonth() + "," + testData.getYear())
                        .checkResult("Subjects", testData.getSubjects())
                        .checkResult("Hobbies", testData.getHobbies())
                        .checkResult("Picture", testData.getPicture())
                        .checkResult("Address", testData.getAddress())
                        .checkResult("State and City", testData.getState() + " " + testData.getCity()));
    }
}