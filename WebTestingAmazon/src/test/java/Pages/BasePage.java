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
    public WebDriverWait wait;

    public BasePage() {
        this.driver = DriverSetup.driver;
        this.wait = new WebDriverWait(this.driver, 15);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    //RetrunSingleElement
    public WebElement returnSingleElement (By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy);
    }

    //ReturnListOfElements
    public List<WebElement> listOfWebElements (By elementBy){
//        waitVisibility(elementBy);
        return driver.findElements(elementBy);
    }

}
