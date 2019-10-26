package br.edu.ifsp.lp2a2.comparex.comparex.comum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
class HomeController{
   @GetMapping("/")
   public String index(Model model){
        return "comum/index";
   }
   @PostMapping("/search")
   public String search(Model model){
       return null;
       
   }
}