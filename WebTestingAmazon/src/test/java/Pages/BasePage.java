package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.Wait;
import hooks.DriverSetup;

public class BasePage {

    protected WebDriver driver;
    public Wait wait;

    public BasePage() {
        this.driver = DriverSetup.driver;
        this.wait = new Wait(this.driver);
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            webElement.isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
