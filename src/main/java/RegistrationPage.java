import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private SelenideElement firstNameField = $("[placeholder=\"First Name\"]");
    private SelenideElement lastNameField = $("[placeholder=\"Last Name\"]");

    private SelenideElement usernameField = $("[placeholder=\"UserName\"]");

    private SelenideElement passwordField = $("[placeholder=\"Password\"]");

    private SelenideElement checkBox = $(byClassName("recaptcha-checkbox-border"));

    private SelenideElement registerButton = $(byId("register"));

    private SelenideElement newUserButton = $(byId("newUser"));

    public void enterfirstNameField(String firstnameValue) {
        firstNameField.shouldBe(visible, Duration.ofSeconds(10));
        firstNameField.setValue(firstnameValue);
    }

    public void enterlastNameField(String lastNameValue) {
        lastNameField.shouldBe(visible, Duration.ofSeconds(10));
        lastNameField.setValue(lastNameValue);
    }


    public void enterUsername(String usernameValue) {
        usernameField.shouldBe(visible, Duration.ofSeconds(10));
        usernameField.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        passwordField.setValue(passwordValue);
    }
    public void clickOncheckBox(){
        checkBox.shouldBe(enabled);
        checkBox.scrollTo();
        checkBox.click();
    }
    public void clickOnregisterButton(){
        registerButton.shouldBe(enabled);
        registerButton.scrollTo();
        registerButton.click();
    }
    public void clickOnnewUserButton(){
        registerButton.shouldBe(enabled);
        registerButton.scrollTo();
        registerButton.click();
    }

}