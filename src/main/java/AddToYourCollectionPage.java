import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddToYourCollectionPage {

    public SelenideElement backToStoreButton = $(byText("Back To Book Store"));
    public SelenideElement addToYourCollectionButton = $(byText("Add To Your Collection"));

    public void clickOnpbackToStoreButton() {
        backToStoreButton.shouldBe(enabled);
        backToStoreButton.scrollTo();
        backToStoreButton.click();
    }
    public void clickOnaddToYourCollectionButton() {
        addToYourCollectionButton.shouldBe(enabled);
        addToYourCollectionButton.scrollTo();
        addToYourCollectionButton.click();
    }
}
