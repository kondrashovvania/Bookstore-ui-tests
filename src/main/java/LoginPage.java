import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;

public class LoginPage {

    private SelenideElement usernameField = $("[placeholder=\"UserName\"]");
    private SelenideElement passwordField = $("[placeholder=\"Password\"]");
    private SelenideElement loginButton = $(By.id("login"));

    public SelenideElement getLoginButton(){
        return loginButton;
    }

    private SelenideElement errorMessage =  $(className("mb-1"));

    private SelenideElement newUserButton = $(By.id("newUser"));

    private SelenideElement backToLoginButton = $(By.id("gotologin"));

    private SelenideElement logOutButton = $(byText("Log out"));

    public SelenideElement getBackToLoginButton() {return backToLoginButton;}

    public void enterUsername(String usernameValue){
        usernameField.shouldBe(visible, Duration.ofSeconds(10));
        usernameField.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue){
        passwordField.setValue(passwordValue);
    }

    public void clickOnLoginButton(){
        loginButton.shouldBe(enabled);
        loginButton.scrollTo();
        loginButton.click();
    }

    public void clockOnNewUserButton(){
        newUserButton.shouldBe(enabled);
        newUserButton.scrollTo();
        newUserButton.click();
    }

    public void clickOnBackToLoginButton(){
        backToLoginButton.shouldBe(enabled);
        backToLoginButton.scrollTo();
        backToLoginButton.click();
    }

    public void clickOnLogOutButton(){
        logOutButton.shouldBe(enabled);
        logOutButton.scrollTo();
        logOutButton.click();
    }

    public SelenideElement getErrorMessage() {
        return errorMessage;
    }
}
