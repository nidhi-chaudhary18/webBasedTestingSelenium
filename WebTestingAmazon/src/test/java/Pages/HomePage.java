package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.amazon.com";
    private static final String PRODUCT_XPATH_IN_SECTION =
            "//following-sibling::div[contains(@id,'desktop-')]//ul[contains(@class,'a-unordered-list')]/li";

    @FindBy(xpath = "//*[contains(@id,'desktop-')]//*[contains(text(),'Best Sellers in Kitchen & Dining')]")
    private WebElement selectedSectionKitchenAndDining;

    @FindBy(xpath = "//*[contains(@id,'desktop-')]//*[contains(text(),'Best Sellers in Cell Phones & Accessories')]")
    private WebElement selectedSectionCellphonesAndAccessories;

    private ProductPage productPage;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage goToHomePage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public void clickOnProductInSection(int ProductNum, String sectionName) {
        wait.forLoading(1000);
        if (sectionName.equals("Best Sellers in Kitchen & Dining")) {
            Assert.assertTrue("WebElement for section " + sectionName + " is not visible",
                    isElementPresent(selectedSectionKitchenAndDining));
            this.selectedSectionKitchenAndDining
                    .findElement(By.xpath(PRODUCT_XPATH_IN_SECTION + "[" + ProductNum + "]")).click();
        } else if (sectionName.equals("Best Sellers in Cell Phones & Accessories")) {
            Assert.assertTrue("WebElement for section " + sectionName + " is not visible",
                    isElementPresent(selectedSectionCellphonesAndAccessories));
            this.selectedSectionCellphonesAndAccessories
                    .findElement(By.xpath(PRODUCT_XPATH_IN_SECTION + "[" + ProductNum + "]")).click();

        }
    }
}
