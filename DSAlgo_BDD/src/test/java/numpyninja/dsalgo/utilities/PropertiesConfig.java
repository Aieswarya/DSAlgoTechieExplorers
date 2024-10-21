package numpyninja.dsalgo.utilities;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import numpyninja.dsalgo.constants.Constants;

public class PropertiesConfig {


	public  void loadProperties()
	{

		Properties properties = new Properties();

		try {

			properties.load(getClass().getResourceAsStream("/Config.properties"));

		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}



		Constants.APP_URL=properties.getProperty("appURL");
		Constants.BROWSER=properties.getProperty("browser");
		Constants.EXECUTION_ENVIRONMENT=properties.getProperty("execution_env");
		Constants.OS_TYPE=properties.getProperty("os");

	}



}
