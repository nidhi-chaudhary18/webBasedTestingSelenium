package Pages;

        import java.util.Iterator;
        import java.util.List;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.amazon.com";

//    @FindBy(xpath = "//*[contains(@id,'desktop-')]//div[1]/div[1]/h2/span[contains(text(),'Best Sellers in Kitchen & Dining')]")
    private WebElement selectedSection;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage goToHomePage(){
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public HomePage clickOnProductInSection(int ProductNum, String sectionName) {
       this.selectedSection.findElement(By.xpath("//*[contains(@id,'desktop-')]//div[1]/div[1]/h2/span[contains(text(),'"+sectionName+"')]"));
//       if(selectedSection.)
//        this.selectedSection.click();
        return this;
    }
}
