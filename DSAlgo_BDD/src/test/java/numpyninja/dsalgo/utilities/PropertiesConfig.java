package numpyninja.dsalgo.utilities;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import numpyninja.dsalgo.constants.Constants;

public class PropertiesConfig {

	//private static String browserType = null;

		/*public static void setBrowserType(String browser) {
			browserType = browser;
		}
		

		public static String getBrowserType() throws Throwable {
			if (browserType != null)
				return browserType;
	        else
				throw new RuntimeException("browser not specified in the testng.xml");
		}*/
		
	public  void loadProperties()
	{
		//FileReader reader = null;
		Properties properties = new Properties();
		
		try {
			//reader= new FileReader("Config.properties");
			properties.load(getClass().getResourceAsStream("/Config.properties"));
			
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		
		
		/*try
		{
			properties.load(reader);
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
		}
		*/
		
		Constants.APP_URL=properties.getProperty("appURL");
		Constants.BROWSER=properties.getProperty("browser");
		Constants.EXECUTION_ENVIRONMENT=properties.getProperty("execution_env");
		Constants.OS_TYPE=properties.getProperty("os");
		Constants.USERNAME=properties.getProperty("username");
		Constants.PASSWORD=properties.getProperty("password");
	}
	
	
	
}
