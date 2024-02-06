import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    final String BASE_URL =
            "https://demoqa.com/login";

    @Before
    public void setUp() {
        Configuration.timeout = 10000;
    //    Configuration.fastSetValue = true;
        Configuration.browserSize = "1300x900";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(BASE_URL);
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }

    public void switchToTab(int tabNum) {
        switchTo().window(tabNum);
    }

    @Feature("Base Test Feature")
    @Story("Base Test Story")
    @Description("Base Test Description")
    @io.qameta.allure.Step("Open the application")
    @Before
    public void openApplication() {
        open(BASE_URL);
    }

    @After
    public void closeBrowser() {
        closeWebDriver();
    }

    // Other methods and page objects...

    @Test
    @Feature("Your Test Feature")
    @Story("Your Test Story")
    @Description("Description of your test")
    public void yourTestMethod() {
        // Your test logic here
    }

    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();

    RegistrationPage registrationPage = new RegistrationPage();

    ProfilePage profilePage = new ProfilePage();

    BookStorePage bookStorePage = new BookStorePage();
    AddToYourCollectionPage addToYourCollectionPage = new AddToYourCollectionPage();

}