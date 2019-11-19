package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.*;

public class DriverSetup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() {
//        WebDriver driver = getDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi.chaudhary\\Project\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
//        driver.get("www.amazon.com");
    }
    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
