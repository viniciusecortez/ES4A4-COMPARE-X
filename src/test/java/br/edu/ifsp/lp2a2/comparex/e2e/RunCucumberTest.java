package br.edu.ifsp.lp2a2.comparex.e2e;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty", "html:target/cucumber"})
public class RunCucumberTest {

}
