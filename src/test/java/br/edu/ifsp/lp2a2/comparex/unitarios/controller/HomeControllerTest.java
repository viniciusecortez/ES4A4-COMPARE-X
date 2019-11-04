package br.edu.ifsp.lp2a2.comparex.unitarios.controller;

import br.edu.ifsp.lp2a2.comparex.comum.controllers.HomeController;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class HomeControllerTest {

    @Test
    public void index_return_template() {
        // Configuracao
        HomeController controller = new HomeController();
        String actual = controller.index();
        String expected = "comum/index";
        assertEquals(expected, actual);
    }

}