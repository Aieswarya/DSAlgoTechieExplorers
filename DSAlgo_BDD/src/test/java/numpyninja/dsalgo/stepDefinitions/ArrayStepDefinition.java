package numpyninja.dsalgo.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.ArrayPage;
import numpyninja.dsalgo.pageObjects.LoginPage;
import numpyninja.dsalgo.pageObjects.SignIn;
import numpyninja.dsalgo.webdriver_manager.DriverManager;


public class ArrayStepDefinition extends BaseClass {
	
	@Given("the user is logged in")
    public void the_user_is_logged_in() {
    	loginPage = new LoginPage(DriverManager.getDriver());
    	arrayPage = new ArrayPage(DriverManager.getDriver());
    	signIn = new SignIn(DriverManager.getDriver());
    	
    	signIn.gotologinPg();
    	signIn.PassCredentials();
    }
	
	@When("The user writes the Valid python code in Editor and Clicks Run button")
	public void the_good_code_is_run() {
		arrayPage.enterValidCode();
	}

	@Then("The User should be able to see the output in the console")
	public void the_user_is_able_to_see_the_output_inside_the_console() {
		boolean result = arrayPage.ValidateOutput();
		Assert.assertTrue(result);
	}

	@When("The user writes the invalid python code in Editor and Clicks Run button")
	public void the_user_writes_the_invalid_python_code() {
		arrayPage.enterInValidCode();
	}

	@Then("The User should should be in the same page with an alert window")
	public void the_user_should_see_an_error_message_in_alert_window() {
		boolean result = arrayPage.alertMsgIsDisplayed();
		Assert.assertTrue(result);
	}

    @When("the {string} link is clicked on {string}")
    public void the_num_test_is_run(String link, String from) {
    	DriverManager.getDriver().get(getPageUrl(from));
    	getAnchor(link).click();
    }
    
    @Then("the expected {string} page should load")
    public void the_expected_num_page_should_load(String page) {
    	Assert.assertEquals(getPageUrl(page), DriverManager.getDriver().getCurrentUrl());
    }
    
    private WebElement getAnchor(String link) {
    	WebElement a = new RemoteWebElement();
        switch (link) {
        case "Array":
        	a = arrayPage.getStarted;
            break;
        case "Arrays in Python":
        	a = arrayPage.arraysInPython;
            break;
        case "Arrays using List":
        	a = arrayPage.arraysUsingList;
            break;
        case "Basic Operations in Lists":
        	a = arrayPage.arraysBasicList;
            break;
        case "Applications of Array":
        	a = arrayPage.arraysApps;
            break;
        case "Practice":
        	a = arrayPage.practice;
        	break;
        case "Editor":
        	a = arrayPage.editor;
        	break;
        }
        
        return a;
    }
    
    private String getPageUrl(String pageName) {
    	switch (pageName) {
    		case "Home":
    			return arrayPage.HOME;
	        case "Array":
	            return arrayPage.ARRAY_PAGE_URL;
	        case "Arrays in Python":
	            return arrayPage.ARRAY_PYTHON_URL;
            case "Arrays using List":
                return arrayPage.ARRAY_LIST_URL;
            case "Basic Operations in Lists":
                return arrayPage.ARRAY_BASIC_URL;
            case "Applications of Array":
                return arrayPage.ARRAY_APPS_URL;
            case "Editor":
            	return arrayPage.EDITOR;
            case "Practice":
            	return arrayPage.ARRAY_PRACTICE;
        }
        
        return "";
    }

}

    
    