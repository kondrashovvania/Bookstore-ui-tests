
import org.junit.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BaseTest {
    @Test
    public void successLogin() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
    }
@Test
    public void invalidPassword() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12Test");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage().shouldBe(visible).shouldHave(text("Invalid username or password!"));
    }

    @Test
    public void invalidUsername() {
        loginPage.enterUsername("kondrashovvania1Test");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage().shouldBe(visible).shouldHave(text("Invalid username or password!"));
    }

    @Test
    public void emptyData() {
        loginPage.enterUsername("");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.getLoginButton().shouldBe(visible);
       // loginPage.
    }

    @Test
    public void emptyUserNameField() {
        loginPage.enterUsername("");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        loginPage.getLoginButton().shouldBe(visible);
    }

    @Test
    public void emptyPasswordField() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.getLoginButton().shouldBe(visible);
    }
@Test
    public void newUserButton() {
        loginPage.clockOnNewUserButton();
        loginPage.getBackToLoginButton().shouldBe(visible);
    }
    @Test
    public void logOutButton() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOnlogOutButton();
    }
}

// с пустыми полями. с одним пустым полем. кнопка новый юзер