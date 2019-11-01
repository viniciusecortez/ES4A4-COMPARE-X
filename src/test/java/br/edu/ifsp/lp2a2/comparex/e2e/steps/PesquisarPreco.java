package br.edu.ifsp.lp2a2.comparex.e2e.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PesquisarPreco {
    private WebDriver driver;
    @Given("Estou na página inicial da minha aplicação")
    public void pagina_inicial(){

        this.driver = new PhantomJSDriver();
        this.driver.get("http://localhost:8080/");
    }
    @When("Eu digito dentro do campo {string}")
    public void digitar_algo(String algo){
        this.driver.findElement(By.cssSelector("input[name=\"pesquisar\"]")).sendKeys(algo);
    }
    @And("clico no botão {string}")
    public void clique_botao(String nomeBotao){
        this.driver.findElement(By.linkText(nomeBotao)).submit();
    }
}
