package pages.homepage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AmazonHomePage extends BasePage {

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
        openBrowser();
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
