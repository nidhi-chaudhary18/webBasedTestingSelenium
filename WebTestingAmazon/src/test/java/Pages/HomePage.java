package Pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.amazon.com";

    @FindBy(css = "#hplogo")
    private WebElement logo;

    @FindBy(css = "input[name=q]")
    private WebElement searchInput;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage goToHomePage(){
        driver.get(HOME_PAGE_URL);
        return this;
    }

    public HomePage verifySectionLinkOnHomePage(String sectionName) {
        assertEquals(By.partialLinkText(sectionName), sectionName);
        return this;
    }
}
