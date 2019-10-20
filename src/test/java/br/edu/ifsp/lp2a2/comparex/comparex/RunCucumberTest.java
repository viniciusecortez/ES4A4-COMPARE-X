package br.edu.ifsp.lp2a2.comparex.comparex;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/cucumber")
public class RunCucumberTest {

}
