package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Helper;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    
	@Before
    public void setUp() {
    	Helper.driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
    	if(Helper.driver != null) {
    		Helper.driver.close();
    		Helper.driver.quit();
        }
    }
    
}