package br.com.blsoft.automatrem;

import org.apache.commons.exec.launcher.OS2CommandLauncher;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.blsoft.WebDriverFirefox;
import br.com.utils.OsUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        OsUtils osUtils = new OsUtils();
        WhatsappWeb whatsappWeb = new WhatsappWeb(new WebDriverFirefox(osUtils.isWindows()));
        whatsappWeb.acessar();
        whatsappWeb.getDados();
        whatsappWeb.webDriverManager.driver.quit();

    }
}
