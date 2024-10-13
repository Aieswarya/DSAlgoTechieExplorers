package numpyninja.dsalgo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import numpyninja.dsalgo.pageObjects.RegisterPage;

public class RegisterStepDefinition {
	
	public RegisterPage registerPage;	
	public WebDriver chromedriver;

	@Given("User Launches Chrome Browser")
	public void user_launches_chrome_browser() {
		chromedriver = new ChromeDriver();
		  registerPage = new RegisterPage(chromedriver);   
	}

	@When("User opens link {string}")
	public void user_opens_link(String url) {
		chromedriver.get(url);
	}
	
	@And("User enters Username as {string} and Password as {string} and Password confirmation as {string}")
	public void user_enters_username_as_and_password_as_and_password_confirmation_as(String string, String string2, String string3) {
		 registerPage.SetUserName(string);
		  registerPage.SetPassword(string2); 
		  registerPage.SetPassword2(string3); 
	}

	@When("User clicks on Register button with expected status as {string}")
	public void user_clicks_on_register_button_with_expected_status_as(String string) {
	    registerPage.ClickBtnRegister();
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
	
	
	
