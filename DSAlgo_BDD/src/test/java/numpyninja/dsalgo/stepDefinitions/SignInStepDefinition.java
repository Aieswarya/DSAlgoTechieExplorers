package numpyninja.dsalgo.stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.SignIn;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class SignInStepDefinition {

	SignIn si = new SignIn(DriverManager.getDriver());
	@Given("The user is on sign in page")
	public void the_user_is_on_sign_in_page() {
	    si.gotologinPg();
	}

	@When("The user passes credentials to username and password fields")
	public void the_user_passes_credentials_to_username_and_password_fields() {
		si.PassCredentials();
	    
	}

	@Then("The user is on DS Home Page with sign in")
	public void The_user_is_on_DS_Home_Page_with_sign_in() {
	    boolean result = si.LoggedInsuccess();
	    Assert.assertTrue(result);
	}

}
