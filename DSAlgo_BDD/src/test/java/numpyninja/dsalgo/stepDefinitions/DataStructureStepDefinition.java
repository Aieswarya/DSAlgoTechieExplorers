package numpyninja.dsalgo.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.DataStructurePage;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class DataStructureStepDefinition {

	boolean result;
	WebDriver driver;
	
	private static final Logger LOGGER=LogManager.getLogger(SignInStepDefinition.class);
	
	DataStructurePage ds=new DataStructurePage(DriverManager.getDriver());
	
	//--------------------------------------First Scenario------------------------------------------------//
	
	@Given("successful signin with valid credentials")
	public void successful_signin_with_valid_credentials() {
		System.out.println("I am inside the DS_background second scenario");
	      ds.navigateDSHomepage();
	      LOGGER.info("successful signin with valid credentials");
	}

	@When("The user clicks on Get Started button on the home page")
	public void the_user_clicks_on_get_started_button_on_the_home_page() {
		System.out.println("I am inside the DS first scenario when feature");
		ds.clickDSStarted();
		 LOGGER.info("The user clicks on Get Started button on the DS home page");
	}

	@Then("The user should be directed to the Data structures introduction page")
	public void the_user_should_be_directed_to_the_data_structures_introduction_page() {
	    
		 result=ds.ValidateURL("https://dsportalapp.herokuapp.com/data-structures-introduction/" );
		 Assert.assertTrue(result);
		 LOGGER.info("The user should be directed to the Data structures introduction page");
	}
	//--------------------------------------First Scenario Complete------------------------------------------------//
	
	//-------------------------------Second Scenario-------------------------------------------------//

	@Given("The user is in the Data structures introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		System.out.println("I am inside the DS second scenario Given feature");
		ds.clickDSStarted();
		LOGGER.info("The user is in the Data structures introduction page");
	}

	@When("The user clicks on the Time Complexity link")
	public void the_user_clicks_on_the_time_complexity_link() {
		ds.clickTimeComplexity();
		LOGGER.info("The user clicks on the Time Complexity link");
	}

	@Then("The user should be directed to the time complexity page")
	public void the_user_should_be_directed_to_the_time_complexity_page() {
		
		 result=ds.ValidateURL("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/" );
		 Assert.assertTrue(result);
		 LOGGER.info("The user should be directed to the time complexity page");
		
	}
	//-------------------------------------------Second Scenario Complete--------------------------------//
	
	//--------------------------------------------Third Scenario------------------------------------------------//
	
	@Given("The user is in the Time complexity page")
	public void the_user_is_in_the_time_complexity_page() {
		System.out.println("I am inside the DS Third scenario Given feature");
		ds.clickDSStarted();
		ds.clickTimeComplexity();
		LOGGER.info("The user is in the Time complexity page");
		
	}

	@When("The user clicks on the Try here button")
	public void the_user_clicks_on_the_try_here_button() {
		ds.clickTryHere();
		LOGGER.info("The user clicks on the Try here button");
	}

	@Then("The user should be directed to the Try Editor page with run button to test")
	public void the_user_should_be_directed_to_the_try_editor_page_with_run_button_to_test() {
	
		 result=ds.ValidateURL("https://dsportalapp.herokuapp.com/tryEditor" );
		 Assert.assertTrue(result);
		 LOGGER.info("The user should be directed to the Try Editor page with run button to test");
	}
	
	//---------------------------------------------Third Scenario Complete---------------------------------//
	
	//--------------------------------------------Fourth Scenario-------------------------------------------//

	@Given("The user is in the Try Editor page")
	public void the_user_is_in_the_try_editor_page() {
		ds.clickDSStarted();
		ds.clickTimeComplexity();
		ds.clickTryHere();
		LOGGER.info("The user is in the Try Editor page");
	}

	@When("The user writes Valid Python code")
	public void the_user_writes_valid_python_code() {
		
		ds.enterValidCode();
		System.out.println("The user writes Valid python code for Timecomplexity module of DS");
		LOGGER.info("The user writes Valid Python code for Timecomplexity module of DS");
		
	}

	@When("Click run button")
	public void click_run_button() {
		
		ds.clickRun();
		LOGGER.info("Click run button");
	}

	@Then("The user is able to see the output in the console")
	public void the_user_is_able_to_see_the_output_in_the_console() {
		
		result=ds.ValidateOutput();
		Assert.assertTrue(result);
		LOGGER.info("The user is able to see the output in the console");
		
	}
//---------------------------------------Fourth Scenario Complete----------------------------------//

//--------------------------------------Fifth Scenario------------------------------------------------//	
	
	@When("The user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
	    ds.enterInValidCode();
	    System.out.println("The user writes invalid python code for Timecomplexity module of DS");
	    LOGGER.info("The user writes invalid python code");
	}

	@Then("User is able to see the error msg in alert window")
	public void user_is_able_to_see_the_error_msg_in_alert_window() {
		result=ds.alertMsgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("User is able to see the error msg in alert window");
	   
	}

//------------------------------------Fifth Scenario Complete--------------------------------------//
	
//------------------------------------Sixth Scenario---------------------------------------------//	
	
	
	@Given("The user is on the editor page with Alert error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
		ds.clickDSStarted();
		ds.clickTimeComplexity();
		ds.clickTryHere();
		ds.enterInValidCode();
		ds.clickRun();
		LOGGER.info("The user is on the editor page with Alert error message for TimeComplexity of DS");
	}

	@When("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
	   ds.alertMsgIsDisplayed();
	   LOGGER.info("The user click the ok button in the alert window");
	}

	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
		
		result=ds.ValidateURL("https://dsportalapp.herokuapp.com/tryEditor" );
		Assert.assertTrue(result);
		LOGGER.info("The user is on the same page having Editor and Run button");
	}
	
   //-----------------------------------------------Sixth Scenario Complete-----------------------------------//
	
	//---------------------------------------------Seventh Scenario-----------------------------------------//
	
	@When("The user wont enter any python code")
	public void the_user_wont_enter_any_python_code() {
	    ds.noCodeEntered();
	    ds.clickRun();
		LOGGER.info("The user wont enter any python code");
	}

	//---------Seventh Scenario Complete it shares common Given and Then definition-----------------------------------------//
	
	//--------------------------------------Eighth Scenario-----------------------------------------------//
	
	
	@When("The user clicks on Practice questions link")
	public void the_user_clicks_on_practice_questions_link() {
		ds.clickPracticeQuestions();
	}

	@Then("The user should see content on Practice questions page")
	public void The_user_should_see_content_on_Practice_questions_page() {
		
		result=ds.ValidateURL("https://dsportalapp.herokuapp.com/data-structures-introduction/practice" );
		 Assert.assertFalse(result);
		
	}

	
}
