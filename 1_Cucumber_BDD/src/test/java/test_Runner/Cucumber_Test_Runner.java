package test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/resources/FeatureFile"},
glue = {"step_Definition"},
tags =  "@Sausedemo_app__order_Item",
plugin = {"pretty","html:target/htmlreport.html"},
dryRun = false,
monochrome = true) 
public class Cucumber_Test_Runner extends AbstractTestNGCucumberTests
{
	
}
