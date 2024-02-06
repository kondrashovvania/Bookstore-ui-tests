import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class BooksPage {

private SelenideElement goToStoreButton = $(byId("gotoStore"));

    public SelenideElement getgoToStoreButton() {
        return goToStoreButton;
    }
}
