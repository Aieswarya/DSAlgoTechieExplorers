package numpyninja.dsalgo.stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.constants.Constants;
import numpyninja.dsalgo.pageObjects.SignInPage;
import numpyninja.dsalgo.utilities.ExcelUtils;
import numpyninja.dsalgo.webdriver_manager.DriverManager;


public class SignInStepDefinition {
	
	  String username;
	  
	  String password;
	  
	  String message;
	  
	
	private static final Logger LOGGER= LogManager.getLogger(SignInStepDefinition.class);

	Constants constant=new Constants();
	
	SignInPage sp = new SignInPage(DriverManager.getDriver());
	
	@Given("the user clicks GetStarted button in the home page")
	public void the_user_clicks_get_started_button_in_the_home_page() {
		System.out.println("I am inside the DS_background first scenario");
	    sp.navigateSignIn();
	    LOGGER.info("the user clicks GetStarted button in the home page");
	}
	
	@Given("The user is in SignIn page")
	public void The_user_is_in_SignIn_page() {
		System.out.println("The user is in SignIn page");
		sp.clickSignIn();
		System.out.println(DriverManager.getDriver().getTitle());
	    LOGGER.info("SignIn button is clicked");
	}
    


  @When("The user passes the valid credentials")
 public void The_user_passes_the_valid_credentials() {
      sp.ValidCredentials();
      LOGGER.info("The user passes the valid credentials");
      
 }

  @When("Click on Login button")
  public void Click_on_Login_button() {
   sp.clickLogin();
   LOGGER.info("Click on Login button");
 }

  @Then("You are logged in message should be displayed")
  public void you_are_logged_in_message_should_be_displayed() {
	
	boolean result=sp.getLoginMessage();
	Assert.assertTrue(result);
    LOGGER.info("You are logged in message should be displayed");
}

  @Then("Username should be displayed as a link")
  public void username_should_be_displayed_as_a_link() {
  
	  sp.isUsernameDisplayedAsLink();
	  LOGGER.info("Username should be displayed as a link");
}
  
  @When("The user enter sheet {string} and {int}")
  public void the_user_enter_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException{
	  
	  
	  
	  switch(sheetname)
	  {
	  case("INVALID_LOGIN"):
		  sp.readInvalidCredentials(sheetname, rownumber);
	      break;
	  }  
	  LOGGER.info("The user enter sheet {string} and {int}");
	  }
	  
 @Then("User should see an error message displayed for incorrect credentials {int}")
 public void user_should_see_an_error_message_displayed(int rownumber) {
	  boolean result= sp.ValidateLoginErrorMsg(rownumber);
	  Assert.assertTrue(result);
	  LOGGER.info("User should see an error message displayed for incorrect credentials"); 
	}


}
