package ui.pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HobbiesPage {
    public HobbiesPage setHobbies(String value) {

        $("#hobbiesWrapper").$(byText(value)).click();

        return this;
    }
}