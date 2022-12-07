package br.com.blsoft;

import br.com.blsoft.automatrem.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFirefox extends WebDriverManager{

    public WebDriverFirefox(){
        this.driverPath = "webdrivers\\geckodriver.exe";
    }

    @Override
    public void iniciarBrowser() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        this.driver = new FirefoxDriver();
    }

    @Override
    public void navegarParaUrl(String url) {
        driver.get(url);
    }
    
}
