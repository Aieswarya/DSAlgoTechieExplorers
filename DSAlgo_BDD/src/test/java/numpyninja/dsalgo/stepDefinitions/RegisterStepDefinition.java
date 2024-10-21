package numpyninja.dsalgo.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import numpyninja.dsalgo.pageObjects.RegisterPage;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class RegisterStepDefinition {
	
	public RegisterPage registerPage;	
	public WebDriver chromedriver;
	private static final Logger LOGGER = LogManager.getLogger(RegisterStepDefinition.class);


	@Given("User Launches register page")
	public void user_launches_chrome_browser() {
		chromedriver = DriverManager.getDriver();
	    registerPage = new RegisterPage(chromedriver);   
		chromedriver.get(registerPage.url);
	}
	
	@And("User enters Username as {string} and Password as {string} and Password confirmation as {string}")
	public void user_enters_username_as_and_password_as_and_password_confirmation_as(String string, String string2, String string3) {
		 registerPage.SetUserName(string);
		  registerPage.SetPassword(string2); 
		  registerPage.SetPassword2(string3); 
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button_with_expected_status_as() {
	    registerPage.ClickBtnRegister();
	}
	
	@Then("the {string} error should appear")
    public void the_user_should_see_error_message(String error) {
		System.out.println(registerPage.ErrorMessage());
        Assert.assertEquals(error, registerPage.ErrorMessage());
        Assert.assertTrue(true);
    }
	
	@Then("the error should appear")
    public void the_uer_should_see_error_message() {
		System.out.println(registerPage.ErrorMessage());
    }	

	/*
	@Then("the user should see an error message indicating that the username is required")
    public void the_user_should_see_username_required_error_message() {
        Assert.assertTrue("Username required error message not displayed", registerPage.isUsernameRequiredErrorDisplayed());
    }

    @Then("the user should see an error message indicating that the passwords do not match")
    public void the_user_should_see_password_mismatch_error_message() {
        Assert.assertTrue("Password mismatch error message not displayed", registerPage.isPasswordMismatchErrorDisplayed());
    }

    @Then("the user should see an error message indicating that the password is too weak")
    public void the_user_should_see_weak_password_error_message() {
        Assert.assertTrue("Weak password error message not displayed", registerPage.isWeakPasswordErrorDisplayed());
    }*/
}
	
	
	
