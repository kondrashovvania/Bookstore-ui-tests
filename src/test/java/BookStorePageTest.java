import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static java.lang.Thread.sleep;
import static com.codeborne.selenide.CollectionCondition.size;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookStorePageTest extends BaseTest {
@Test
    public void checkBooksByTitleSortAtoZ() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        bookStorePage.clickOntitleSort();
        assertTrue(bookStorePage.checkSortedByTittleAtoZ());
    }

    @Test
    public void checkBooksByAuthorSortAtoZ() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        bookStorePage.clickOnauthorSort();
        assertTrue(bookStorePage.checkSortedByAuthorAtoZ());
    }

    @Test
    public void checkBooksByPublisherSortAtoZ() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        bookStorePage.clickOnpublisherSort();
        assertTrue(bookStorePage.checkSortedByPublisherAtoZ());
    }
    @Test
    public void checkBooksByTitleSortZtoA() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        bookStorePage.clickOntitleSort();
        bookStorePage.clickOntitleSort();
        assertTrue(bookStorePage.checkSortedByTitleZtoA());
    }
    @Test
    public void checkBooksByAuthorSortZtoA() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        bookStorePage.clickOnauthorSort();
        bookStorePage.clickOnauthorSort();
        assertTrue(bookStorePage.checkSortedByAuthorZtoA());
    }
    @Test
    public void checkBooksByPublisherSortZtoA() {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        bookStorePage.clickOnpublisherSort();
        bookStorePage.clickOnpublisherSort();
        assertTrue(bookStorePage.checkSortedByPublisherZtoA());
    }

    @Test
    public void checkBooksCount() throws InterruptedException {
        loginPage.enterUsername("kondrashovvania1");
        loginPage.enterPassword("!Kondrashovvania_12");
        loginPage.clickOnLoginButton();
        booksPage.getgoToStoreButton().shouldBe(visible);
        profilePage.clickOngoToStoreButton();
        sleep(2000);
        assertTrue(bookStorePage.isListIsDisplayed());
        assertEquals(8, bookStorePage.getbookList());
        assertTrue("Not all items are displayed", bookStorePage.allBooksAreDisplayed());
        assertTrue(bookStorePage.allBooksAreNotEmpty());
    }
}
