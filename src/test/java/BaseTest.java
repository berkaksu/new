import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static String baseUrl = System.getProperty("baseUrl", "https://obss.com.tr/tr/");

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("acceptInsecureCerts", true);
        capabilities.setCapability("key", System.getProperty("key"));

            System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver");
            driver = new ChromeDriver(capabilities);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--allow-running-insecure-content");

            driver.manage().window().fullscreen();

        driver.get(baseUrl);
    }

    @After
    public void tearDown() throws Exception {
       	driver.quit();

    }
}
