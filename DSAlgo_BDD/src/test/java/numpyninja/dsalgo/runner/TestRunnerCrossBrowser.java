package numpyninja.dsalgo.runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import numpyninja.dsalgo.utilities.PropertiesConfig;

@CucumberOptions(features = { "src/test/resources/features" }, glue = {
		"numpyninja.dsalgo.stepDefinitions" }, dryRun = false, monochrome = false, plugin = {
				"rerun:failed_scenarios/failed_scenarios.txt", "json:target/cucumber-reports/Cucumber.json", "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, publish = true
// tags=@sanity
)
public class TestRunnerCrossBrowser extends AbstractTestNGCucumberTests {

	@BeforeTest
	@Parameters({ "browser"})
	public void defineBrowser(String browser) throws Throwable {
		PropertiesConfig propertiesConfig = new PropertiesConfig();
		propertiesConfig.setPropertiesforCrossbrowsertesting(browser);

	}

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
