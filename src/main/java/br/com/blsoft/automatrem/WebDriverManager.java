package br.com.blsoft.automatrem;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverManager {
    protected String driverPath;
    protected WebDriver driver;

    public abstract void iniciarBrowser();
    public abstract void navegarParaUrl(String url);

}
