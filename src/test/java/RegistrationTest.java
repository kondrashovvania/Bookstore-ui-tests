import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;

public class RegistrationTest extends BaseTest{

    @Test
    public void successRegistration() {
        loginPage.clickOnLoginButton();
        loginPage.clockOnNewUserButton();
        registrationPage.enterfirstNameField("Ivan");
        registrationPage.enterlastNameField("C");
        registrationPage.enterUsername("kondrashovvania1234");
        registrationPage.enterPassword("!Kondrashovvania_12");
        registrationPage.clickOncheckBox();
        registrationPage.clickOnregisterButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
    }
}
