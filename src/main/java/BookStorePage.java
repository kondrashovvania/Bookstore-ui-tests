import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

public class BookStorePage {

    public ElementsCollection List = $$(byClassName("rt-table"));

    public SelenideElement imageSort = $(byText("Image"));
    public SelenideElement titleSort = $(byText("Title"));
    public SelenideElement authorSort = $(byText("Author"));
    public SelenideElement publisherSort = $(byText("Publisher"));


    public ElementsCollection authorColumnValues = $$(".rt-resizable-header-content").filterBy(Condition.text("Author")).first().parent().sibling(0).$$(".rt-td");

    public ElementsCollection getAuthorColumnValues() {
        return authorColumnValues;
    }
    public ElementsCollection titleColumnValues = $$(".rt-resizable-header-content").filterBy(Condition.text("Title")).first().parent().sibling(0).$$(".rt-td");

    public ElementsCollection gettitleColumnValues() {
        return titleColumnValues;
    }

    public ElementsCollection publisherColumnValues = $$(".rt-resizable-header-content").filterBy(Condition.text("Publisher"));

    public ElementsCollection getPublisherColumnValues() {
        return publisherColumnValues;
    }
    public ElementsCollection bookList = $$(byClassName("mr-2"));
    public int getbookList(){
        return bookList.size();
    }
    public boolean isListIsDisplayed(){
        return List.shouldBe(sizeGreaterThan(0)).filter(visible).size() > 0;
    }

    public boolean allBooksAreDisplayed(){
        boolean displayed = true;
        for (WebElement item :List) {
            if (!item.isDisplayed()){
                displayed = false;
            }
        }
        return displayed;
    }

    public boolean allBooksAreNotEmpty(){
        boolean notEmpty = true;
        for (WebElement name: bookList) {
            if (name.getText().isEmpty()){
                notEmpty = false;
            }
        }
        return notEmpty;
    }

    public SelenideElement booksAuthor = $(byClassName(""));
    public SelenideElement booksPublisher = $(byClassName(""));

    public SelenideElement loginPage = $("#item-0.btn.btn-light").$(".menu-list");
    public SelenideElement bookStorePage = $("#item-2.btn.btn-light.active");

    public SelenideElement profilePage = $("#item-3").$(".btn.btn-light").$(".menu-list");
    public SelenideElement bookStoreApiPage = $("#item-4").$(".btn.btn-light").$(".menu-list");

    public SelenideElement gitPocketGuide = $(byId("\"see-book-Git Pocket Guide\""));
    public SelenideElement learningJavaScript = $(byId("see-book-Learning JavaScript Design Patterns"));
    public SelenideElement designingEvolvableWeb = $(byId("see-book-Designing Evolvable Web APIs with ASP.NET"));
    public SelenideElement speakingJavaScript = $(byId("see-book-Speaking JavaScript"));
    public SelenideElement youDontKnowJS = $(byId("see-book-You Don't Know JS"));
    public SelenideElement programmingJavaScript = $(byId("see-book-Programming JavaScript Applications"));
    public SelenideElement eloquentJavaScript = $(byId("see-book-Eloquent JavaScript, Second Edition"));
    public SelenideElement understandingECMAScript = $(byId("see-book-Understanding ECMAScript 6"));


    public SelenideElement getGitPocketGuide() {
        return gitPocketGuide;
    }

    public SelenideElement getLearningJavaScript() {
        return learningJavaScript;
    }

    public SelenideElement getDesigningEvolvableWeb() {
        return designingEvolvableWeb;
    }

    public SelenideElement getSpeakingJavaScript() {
        return speakingJavaScript;
    }

    public SelenideElement getYouDontKnowJS() {
        return youDontKnowJS;
    }

    public SelenideElement getProgrammingJavaScript() {
        return programmingJavaScript;
    }

    public SelenideElement getEloquentJavaScript() {
        return eloquentJavaScript;
    }

    public SelenideElement getUnderstandingECMAScript() {
        return understandingECMAScript;
    }


    public void clickOntitleSort() {
        titleSort.shouldBe(enabled);
        titleSort.scrollTo();
        titleSort.click();
    }

    public void clickOnauthorSort() {
        authorSort.shouldBe(enabled);
        authorSort.scrollTo();
        authorSort.click();
    }

    public void clickOnpublisherSort() {
        publisherSort.shouldBe(enabled);
        publisherSort.scrollTo();
        publisherSort.click();
    }
    public void clickOnprofilePage() {
        profilePage.shouldBe(enabled);
        profilePage.scrollTo();
        profilePage.click();
    }
    public void clickOnGitPocketGuide() {
        gitPocketGuide.shouldBe(enabled);
        gitPocketGuide.scrollTo();
        gitPocketGuide.click();
    }

    public void clickOnLearningJavaScript() {
        learningJavaScript.shouldBe(enabled);
        learningJavaScript.scrollTo();
        learningJavaScript.click();
    }

    public void clickOnDesigningEvolvableWeb() {
        designingEvolvableWeb.shouldBe(enabled);
        designingEvolvableWeb.scrollTo();
        designingEvolvableWeb.click();
    }

    public void clickOnSpeakingJavaScript() {
        speakingJavaScript.shouldBe(enabled);
        speakingJavaScript.scrollTo();
        speakingJavaScript.click();
    }

    public void clickOnYouDontKnowJS() {
        youDontKnowJS.shouldBe(enabled);
        youDontKnowJS.scrollTo();
        youDontKnowJS.click();
    }

    public void clickOnProgrammingJavaScript() {
        programmingJavaScript.shouldBe(enabled);
        programmingJavaScript.scrollTo();
        programmingJavaScript.click();
    }

    public void clickOnEloquentJavaScript() {
        eloquentJavaScript.shouldBe(enabled);
        eloquentJavaScript.scrollTo();
        eloquentJavaScript.click();
    }

    public void clickOnUnderstandingECMAScript() {
        understandingECMAScript.shouldBe(enabled);
        understandingECMAScript.scrollTo();
        understandingECMAScript.click();
    }


    public boolean checkSortedByTittleAtoZ() {
        List<String> actualTitle = new ArrayList<>();
        for (WebElement name: titleColumnValues) {
            actualTitle.add(name.getText());
        }
        List<String> expectedTitle = new ArrayList<>(actualTitle);
        sort(expectedTitle);
        return actualTitle.equals(expectedTitle);
    }

    public boolean checkSortedByAuthorAtoZ() {
        List<String> actualAuthor = new ArrayList<>();
        for (WebElement name: authorColumnValues) {
            actualAuthor.add(name.getText());
        }
        List<String> expectedAuthor = new ArrayList<>(actualAuthor);
        sort(expectedAuthor);
        return actualAuthor.equals(expectedAuthor);
    }

    public boolean checkSortedByPublisherAtoZ() {
        List<String> actualPublisher = new ArrayList<>();
        for (WebElement name: publisherColumnValues) {
            actualPublisher.add(name.getText());
        }
        List<String> expectedPublisher = new ArrayList<>(actualPublisher);
        sort(expectedPublisher);
        return actualPublisher.equals(expectedPublisher);
    }

    public boolean checkSortedByTitleZtoA() {
        List<String> actualTitle = new ArrayList<>();
        for (WebElement name: titleColumnValues) {
            actualTitle.add(name.getText());
        }
        List<String> expectedTitle = new ArrayList<>(actualTitle);
        sort(expectedTitle, reverseOrder());
        return actualTitle.equals(expectedTitle);
    }

    public boolean checkSortedByAuthorZtoA() {
        List<String> actualAuthor = new ArrayList<>();
        for (WebElement name: authorColumnValues) {
            actualAuthor.add(name.getText());
        }
        List<String> expectedAuthor = new ArrayList<>(actualAuthor);
        sort(expectedAuthor, reverseOrder());
        return actualAuthor.equals(expectedAuthor);
    }

    public boolean checkSortedByPublisherZtoA() {
        List<String> actualPublisher = new ArrayList<>();
        for (WebElement name: publisherColumnValues) {
            actualPublisher.add(name.getText());
        }
        List<String> expectedPublisher = new ArrayList<>(actualPublisher);
        sort(expectedPublisher, reverseOrder());
        return actualPublisher.equals(expectedPublisher);
    }
}