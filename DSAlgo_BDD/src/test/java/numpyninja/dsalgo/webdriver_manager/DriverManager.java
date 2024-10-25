package numpyninja.dsalgo.webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.dsalgo.constants.Constants;

public class DriverManager {
	
	private static  WebDriver driver = null;
	private static WebDriver crossbrowserdriver=null;
	

	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
	
	public static void launchBrowser()
	{
		
		try {
			switch(Constants.BROWSER) {
			case"chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new ChromeDriver();
				break;
			case"firefox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new FirefoxDriver();
				break;
			case"edge":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new EdgeDriver();
				break;
			case"ie":
				WebDriverManager.iedriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new InternetExplorerDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new ChromeDriver();
				break;
				}
			
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	// Cross browser testing
	

	public static void setCrossbrowserdriver() {
		

		try {
			switch(Constants.BROWSER) {
			case"chrome":
				ChromeOptions coptions = new ChromeOptions();
				coptions.addArguments("--headless");
				coptions.addArguments("--disable-gpu");
				WebDriverManager.chromedriver().setup();
				
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new ChromeDriver(coptions);
				break;
			case"firefox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new FirefoxDriver();
				break;
			case"edge":
				EdgeOptions eoptions =new EdgeOptions();
				eoptions.addArguments("--headless");
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new EdgeDriver(eoptions);
				break;
			case"ie":
				WebDriverManager.iedriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new InternetExplorerDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver=new ChromeDriver();
				break;
				}
			
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		
		
	}
	public static WebDriver getCrossbrowserdriver() {
		return crossbrowserdriver;
	}
}
