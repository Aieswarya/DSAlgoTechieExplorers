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
import numpyninja.dsalgo.utilities.PropertiesConfig;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class Hooks {
	
	public static final Logger  LOGGER=LogManager.getLogger(Hooks.class);
	
	
	@Before
	public void beforeScenario() {
		LOGGER.info("Execution started..");
		System.out.println("In Hooks class started ....");
		try
		{
			//LOGGER.info("Instantiating the PropertiesReader class");
			
			PropertiesConfig propertiesConfig = new PropertiesConfig();
			//LOGGER.info("Loading the Properties file ...");
			propertiesConfig.loadProperties();
			//LOGGER.info("Checking the Driver is null or not null");
			
			if(DriverManager.getDriver() == null)
			{
				LOGGER.info("Driver is null, instantiating it ");
				DriverManager.launchBrowser();
				DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				DriverManager.getDriver().get(Constants.APP_URL);
				
				LOGGER.info("DS Algo website launched");
				System.out.println("Completed launching website");
			}
		}
		catch(Exception exception) {
			exception.printStackTrace();
			
		}
			
	}
	
	@After
	public void teardown()
	{
		DriverManager.getDriver().quit();
		LOGGER.info("Driver is shutdown");
		System.out.println("shutting down");
	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte[] screenshotTaken=((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotTaken, "image/png", "error screen");
		}
	}

}
