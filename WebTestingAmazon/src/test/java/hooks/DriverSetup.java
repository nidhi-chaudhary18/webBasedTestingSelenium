package hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;

public class DriverSetup {
    public static WebDriver driver;

    public static String absPath = System.getProperty("user.dir");
    public static final String DRIVER_PATH = absPath + "//chromedriver.exe";
    private static final String CONFIG_PATH = absPath + "//src//test//resources//config//config.properties";

    Properties properties;
    InputStream ip;

    @Before
    public void setWebDriver() throws IOException {
        //        properties = new Properties();
        //        ip = new FileInputStream(CONFIG_PATH);
        //        properties.load(ip);
        //        System.setProperty("webdriver.chrome.driver", properties.getProperty("driver_path"));
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

}
