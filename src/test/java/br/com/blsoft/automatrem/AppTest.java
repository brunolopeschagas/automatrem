package br.com.blsoft.automatrem;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    String driverPath = "webdrivers\\geckodriver.exe";
    public WebDriver driver;

    @Before
    public void startBrowser() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
    }

    @Test
    public void navigateToUrl() {
        driver.get("https://web.whatsapp.com/");
    }

    @After
    public void endTest() {
        driver.quit();
    }
}
