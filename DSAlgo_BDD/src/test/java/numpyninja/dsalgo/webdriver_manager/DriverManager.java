package numpyninja.dsalgo.webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ThreadGuard;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.dsalgo.constants.Constants;

public class DriverManager {
	
	public static   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
	public static ChromeOptions co = new ChromeOptions();
	public static EdgeOptions eo=new EdgeOptions();
	
	public static void launchBrowser()
	{
		try {
			switch(Constants.BROWSER) {
			case"chrome":	
				System.out.println("I am inside chrome driver switch case");
				LOGGER.info("Launching "+ Constants.BROWSER);
				co.setPageLoadStrategy(PageLoadStrategy.EAGER);
				driver.set(new ChromeDriver(co));
				break;
			case"firefox":
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver.set(ThreadGuard.protect(new FirefoxDriver()));
				break;
			case"edge":
				System.out.println("I am inside edge switch case");
				LOGGER.info("Launching "+ Constants.BROWSER);
				eo.setPageLoadStrategy(PageLoadStrategy.EAGER);
				driver.set(ThreadGuard.protect(new EdgeDriver(eo)));
				System.out.println("I have set driver value");
				break;
			case"ie":
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver.set(ThreadGuard.protect(new InternetExplorerDriver()));
				break;
			default:
				LOGGER.info("Launching "+ Constants.BROWSER);
				driver.set(ThreadGuard.protect(new ChromeDriver()));
				break;
				}
			
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		//System.out.println("I am insidegetdrivermethod");
		return driver.get();
	}
	
	

}
