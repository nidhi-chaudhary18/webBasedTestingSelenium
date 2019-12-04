package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.Wait;
import hooks.DriverSetup;

public class BasePage {

    protected WebDriver driver;
//    protected Wait wait;
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
