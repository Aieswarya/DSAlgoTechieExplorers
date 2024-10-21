package numpyninja.dsalgo.webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import numpyninja.dsalgo.constants.Constants;

public class DriverManager {

	private static WebDriver driver = null;
	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);

	public static void launchBrowser() {
		System.out.println("Entering WebDriver Manager");

		try {
			switch (Constants.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new EdgeDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new InternetExplorerDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new ChromeDriver();
				break;
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static WebDriver getDriver() {

		System.out.println("Entering get Driver Manager");

		return driver;
	}
}
