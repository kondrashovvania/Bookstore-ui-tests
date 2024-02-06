import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BooksPage {

private SelenideElement goToStoreButton = $(By.id("gotoStore"));

    public SelenideElement getgoToStoreButton() {
        return goToStoreButton;
    }
}
