package Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    private static final String HOME_PAGE_URL = "https://www.amazon.com";

    @FindBy(xpath = "//*[contains(@id,'desktop-')]//div[1]/div[1]/h2/span[contains(text(),'Best Sellers in Kitchen & Dining')]")
    private WebElement selectedSectionKitchenAndDining;

    @FindBy(xpath = "//*[contains(@id,'desktop-')]//div[1]/div[1]/h2/span[contains(text(),'Best Sellers in Cell Phones & Accessories')]")
    private WebElement selectedSectionCellphonesAndAccessories;

    private ProductPage productPage;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage goToHomePage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public ProductPage clickOnProductInSection(int ProductNum, String sectionName) {
        if(sectionName.equals("Best Sellers in Kitchen & Dining")){
            this.selectedSectionKitchenAndDining.findElement(By.xpath(".//*ul[class*='a-unordered-list']li:nth-child(5)input[class*='button-input']")).click();
            return productPage;
        }
        else if (sectionName.equals("Best Sellers in Cell Phones & Accessories")){
            this.selectedSectionCellphonesAndAccessories.findElement(By.xpath(".//*ul[class*='a-unordered-list']li:nth-child(5)input[class*='button-input']")).click();
            return productPage;
        }
        return null;
    }
}
