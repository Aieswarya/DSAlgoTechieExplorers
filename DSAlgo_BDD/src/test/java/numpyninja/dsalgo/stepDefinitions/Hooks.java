package numpyninja.dsalgo.stepDefinitions;


import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import numpyninja.dsalgo.constants.Constants;
import numpyninja.dsalgo.utilities.ExcelUtils;
import numpyninja.dsalgo.utilities.PropertiesConfig;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class Hooks {

	public static final Logger LOGGER = LogManager.getLogger(Hooks.class);

	
	@Before
	public void beforeScenario() {
		LOGGER.info("Execution started..");
		
		try {

			PropertiesConfig propertiesConfig = new PropertiesConfig();
			propertiesConfig.loadProperties();   // To read values from Confid.properties file
			ExcelUtils excelutils = new ExcelUtils();
			ExcelUtils.getLogin();
			DriverManager.launchBrowser();	// sets driverValue
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			DriverManager.getDriver().get(Constants.APP_URL); //launches DSAlgo Website

			LOGGER.info("DS Algo website launched");
		} catch (Exception exception) {
			exception.printStackTrace();

		}
		}

	@After
	public void teardown() {
		
		DriverManager.getDriver().quit();
		LOGGER.info("Driver is shutdown");
		
	}

	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshotTaken = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotTaken, "image/png", "error screen");
		}
		

}
}
