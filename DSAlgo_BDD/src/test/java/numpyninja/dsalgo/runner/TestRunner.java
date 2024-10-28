package numpyninja.dsalgo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features"},
		glue={"numpyninja.dsalgo.stepDefinitions"},
		dryRun=false,
		monochrome=false,
		plugin= {"rerun:failed_scenarios/failed_scenarios.txt",
				"json:target/cucumber-reports/Cucumber.json",
				"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		publish=true
		//tags=@sanity
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
