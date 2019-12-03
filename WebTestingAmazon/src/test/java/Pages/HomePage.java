package Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    private static final String HOME_PAGE_URL = "https://www.amazon.com";

//    @FindBy(xpath = "//*[contains(@id,'desktop-')]//div[1]/div[1]/span[contains(text(),'Best Sellers in Kitchen & Dining')]")
    @FindBy(xpath = "//img[contains(@alt,'Mkeke Compatible with iPhone XR Screen Protector, iPhone 11 Screen Protector,Tempered Glass Film for Apple iPhone XR &...')]\")")
    private WebElement selectedSectionKitchenAndDining;

    @FindBy(xpath = "//*[contains(@id,'desktop-')]//div[1]/div[1]/span[contains(text(),'Best Sellers in Cell Phones & Accessories')]")
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
        if(sectionName.equals("Best Sellers in Kitchen & Dining")){
            this.selectedSectionKitchenAndDining.click();
        }
        else if (sectionName.equals("Best Sellers in Cell Phones & Accessories")){
            this.selectedSectionCellphonesAndAccessories.click();
        }
    }
}
