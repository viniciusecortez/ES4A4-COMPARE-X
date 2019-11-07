package br.edu.ifsp.lp2a2.comparex.unitarios.controller;

import br.edu.ifsp.lp2a2.comparex.comum.controllers.HomeController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.ui.Model;
import br.edu.ifsp.lp2a2.comparex.comum.model.entidades.ProdutosRespository;

import org.junit.Test;

public class HomeControllerTest {

    @Test
    public void index_return_template() {
        // Configuracao
        HomeController controller = new HomeController();
        String actual = controller.index(new ProdutosRespository(), new Model());
        String expected = "comum/index";
        assertEquals(expected, actual);
    }

}
