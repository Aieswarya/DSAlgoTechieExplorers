package numpyninja.dsalgo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@failed_scenarios/failed_scenarios.txt",
		glue= {"numpyninja.dsalgo.stepDefinitions"})
public class FailedTestReRun extends AbstractTestNGCucumberTests {

}
