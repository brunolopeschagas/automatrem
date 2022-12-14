package br.com.blsoft.automatrem;



import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome extends WebDriverManager {

    public WebDriverChrome(boolean isWindows) {
        if (isWindows) {
            this.driverPath = "webdrivers\\chromedriver.exe";
        } else {
            this.driverPath = "webdrivers/chromedriver";
        }
    }

    @Override
    public void iniciarBrowser() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        this.driver = new ChromeDriver();
    }

    @Override
    public void navegarParaUrl(String url) {
        driver.get(url);
    }

}
