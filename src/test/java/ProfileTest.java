import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;


public class ProfileTest extends BaseTest {

    @Test
    public void logout() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOnlogOutButton();
    }

    @Test
    public void goToBookStore() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
    }

    @Test
    public void deleteAccountCancel() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOndeleteAccaountButton();
        profilePage.clickOncloseSmallModalCancelButton();
    }

    @Test
    public void deleteAllBooksCancel() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOndeleteAllBooksButton();
        profilePage.clickOncloseSmallModalCancelButton();
    }

    @Test
    public void deleteAllBooksOk() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOndeleteAllBooksButton();
        profilePage.clickOncloseSmallModalOkButton();
    }

    @Test
    public void deleteFirstBooksOk() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOndeleteOneBookButton();
        profilePage.clickOncloseSmallModalOkButton();
    }

    @Test
    public void deleteFirstBooksCancel() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOndeleteOneBookButton();
        profilePage.clickOncloseSmallModalCancelButton();
    }
}
