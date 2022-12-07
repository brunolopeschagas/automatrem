package br.com.blsoft.automatrem;

import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.blsoft.WebDriverFirefox;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WhatsappWeb whatsappWeb = new WhatsappWeb(new WebDriverFirefox());
        whatsappWeb.acessar();
        Thread.sleep(15000);
        whatsappWeb.getDados();
    }
}
