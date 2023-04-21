package ui.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ui.TestBase;
import ui.pages.FormPage;
import ui.test_data.TestData;


public class AutomationPracticeFormPageObjectsTest extends TestBase {
    FormPage formPage = new FormPage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Проверка формы")
    void formTest() {
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
                .setSubmit();

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
                .checkResult("State and City", testData.getState() + " " + testData.getCity());

    }
}