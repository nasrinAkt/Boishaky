package Boishaky_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Boishaky_utility.Boishaky_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/BoishakyFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "Boishaky_StepDefinition",tags={"@tag2"})


public class Boishaky_TestRunner extends AbstractTestNGCucumberTests {

@BeforeTest
public void boisStartURL() {
	
	Boishaky_Base bois = new Boishaky_Base();
	bois.BoisBrowser();
	
	
}
	@AfterTest
	public void boisCloseURL() {
	Boishaky_Base bois = new Boishaky_Base();	
		bois.driver.quit();
		
		
	}
	
	
}
