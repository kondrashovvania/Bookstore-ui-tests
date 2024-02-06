
import org.junit.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.switchTo;
import static java.lang.Thread.sleep;
public class AddToYourCollectionTest extends BaseTest{
@Test
    public void addFirstBookInCollection() throws InterruptedException {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOndeleteAllBooksButton();
        profilePage.clickOncloseSmallModalOkButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        bookStorePage.clickOnGitPocketGuide();
        addToYourCollectionPage.clickOnaddToYourCollectionButton();
        sleep(5000);
        switchTo().alert().accept();
        addToYourCollectionPage.clickOnpbackToStoreButton();
        bookStorePage.clickOnprofilePage();
    }

}
