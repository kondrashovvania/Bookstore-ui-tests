import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private SelenideElement logOutButton = $(byText("Log out"));
    private SelenideElement goToStoreButton = $(byId("gotoStore"));

    private SelenideElement deleteAccaountButton = $(byText("Delete Account"));

    private SelenideElement deleteAllBooksButton = $(byText("Delete All Books"));
    private SelenideElement closeSmallModalOkButton = $(byId("closeSmallModal-ok"));

    private SelenideElement closeSmallModalCancelButton = $(byId("closeSmallModal-cancel"));

    private SelenideElement deleteOneBookButton = $(byId("delete-record-undefined"));
    private SelenideElement profileButton = $(byXpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]"));

    public void clickOnlogOutButton(){
        logOutButton.shouldBe(enabled);
        logOutButton.scrollTo();
        logOutButton.click();
    }

    public void clickOngoToStoreButton(){
        goToStoreButton.shouldBe(enabled);
        goToStoreButton.scrollTo();
        goToStoreButton.click();
    }

    public void clickOndeleteAccaountButton(){
        deleteAccaountButton.shouldBe(enabled);
        deleteAccaountButton.scrollTo();
        deleteAccaountButton.click();
    }

    public void clickOndeleteAllBooksButton(){
        deleteAllBooksButton.shouldBe(enabled);
        deleteAllBooksButton.scrollTo();
        deleteAllBooksButton.click();
    }

    public void clickOncloseSmallModalOkButton(){
        closeSmallModalOkButton.shouldBe(enabled);
        closeSmallModalOkButton.scrollTo();
        closeSmallModalOkButton.click();
    }
    public void clickOndeleteOneBookButton(){
        deleteOneBookButton.shouldBe(enabled);
        deleteOneBookButton.scrollTo();
        deleteOneBookButton.click();
    }

    public void clickOncloseSmallModalCancelButton(){
        closeSmallModalCancelButton.shouldBe(enabled);
        closeSmallModalCancelButton.scrollTo();
        closeSmallModalCancelButton.click();
    }

    public void clickOnprofile(){
        profileButton.shouldBe(enabled);
        profileButton.scrollTo();
        profileButton.click();
    }

}
