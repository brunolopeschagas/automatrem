package br.com.blsoft.automatrem;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatsappWeb implements Acesso {

    WebDriverManager webDriverManager;

    public WhatsappWeb(WebDriverManager webDriverManager) {
        this.webDriverManager = webDriverManager;
    }

    @Override
    public void acessar() {
        this.webDriverManager.iniciarBrowser();
        this.webDriverManager.navegarParaUrl("https://web.whatsapp.com/");
    }

    @Override
    public void getDados() {
        this.getMensagens("henrique");
    }

    private List<String> getMensagens(String nomeContatoGrupo) {
        List<String> mensagens = new ArrayList<>();

        WebElement caixaPesquisa = this.getCaixaPesquisa(nomeContatoGrupo);
        caixaPesquisa.click();
        caixaPesquisa.sendKeys(nomeContatoGrupo);
        WebElement contatoGrupo = this.getGrupoContato(nomeContatoGrupo);
        contatoGrupo.click();

        return mensagens;
    }

    private WebElement getCaixaPesquisa(String pesquisarPor) {
        return new WebDriverWait(this.webDriverManager.driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//div[contains(@title,'Caixa de texto de pesquisa')]")));
    }

    private WebElement getGrupoContato(String pesquisarPor) {
        return new WebDriverWait(this.webDriverManager.driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .elementToBeClickable(
                                By.xpath("//*//span[@title='" + pesquisarPor + "']")));
    }

}
