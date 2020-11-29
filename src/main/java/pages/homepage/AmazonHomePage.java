package pages.homepage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.amazon.com/")
public class AmazonHomePage extends PageObject {

    @FindBy(id = "twotabsearchtextbox")
    private WebElementFacade txtSearchField;

    @FindBy(className = ".nav-input")
    private WebElementFacade btnSearch;

    @FindBy(className = ".a-section.aok-relative")
    private WebElementFacade imgItem;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
        open();
    }

    public void searchAmazonProduct(String product) {
        txtSearchField.waitUntilPresent();
        txtSearchField.sendKeys(product);
    }

    public void clickOnSearchButton() {
        btnSearch.waitUntilClickable();
        btnSearch.click();
    }

    public boolean verifySearchResult() {
        imgItem.waitUntilPresent();
        return imgItem.isDisplayed();
    }
}
