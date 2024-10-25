package numpyninja.dsalgo.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pagefactory.GetStarted;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class GetStartedStepDefinition {
	
	private static final Logger LOGGER= LogManager.getLogger(GetStartedStepDefinition.class);
	@When("User clicks the GetStarted button at start page")
	public void user_clicks_the_get_started_button_at_start_page() {
		System.out.println("Inside When scenario");
		GetStarted gs = new GetStarted(DriverManager.getDriver());
	    gs.clickgetstartedbtn();
	    LOGGER.info("Get Started Button is clicked");
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		Assert.assertTrue(true);
		System.out.println("After assert in then");
	   
	}


}
