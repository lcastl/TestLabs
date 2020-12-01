package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class BasePage extends PageObject {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void openBrowser() {
        try {
            open();
        } catch (WebDriverException ex) {
            throw new WebDriverException("Opening a Driver", ex);
        }
    }
}
