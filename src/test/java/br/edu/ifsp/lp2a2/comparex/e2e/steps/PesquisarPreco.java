package br.edu.ifsp.lp2a2.comparex.e2e.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PesquisarPreco {
    private WebDriver driver;
    @Given("Estou na página inicial da minha aplicação")
    public void pagina_inicial(){
        this.driver = new PhantomJSDriver();
        this.driver.get("http://localhost:8080/");
        String title = this.driver.getTitle();
        String expected = "comparex";
        assertTrue(title.toLowerCase().contains(expected));
    }
    @When("Eu digito dentro do campo {string}")
    public void digito_no_campo(String name){
        WebElement input = this.driver.findElement(By.cssSelector("input[name="+name+"]"));
        String expected = "cano";
        input.sendKeys(expected);
        String actual = input.getAttribute("value");
        assertEquals(expected, actual);
    }

    @And("clico no botão {string}")
    public void click_botao(String textBotao){
        WebElement button = this.driver.findElement(By.id(textBotao));
        button.click();
    }

}
