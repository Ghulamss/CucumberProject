package com.ATIRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.core.cli.Main;
//CucumberProject
// https://github.com/Ghulamss/CucumberProject.git
// Git Tutorial
// username:rajm80876@gmail.com , pass:@rajm80876#7892

@CucumberOptions(features = "src/test/resources/features",
glue = {"com.ATIstepdefinition"},
plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
monochrome = true,
publish = true)
public class Runner extends AbstractTestNGCucumberTests {
	
	 @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}
