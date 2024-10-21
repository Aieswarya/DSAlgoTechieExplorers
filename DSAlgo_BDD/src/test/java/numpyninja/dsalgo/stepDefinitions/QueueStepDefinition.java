package numpyninja.dsalgo.stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.DataStructurePage;
//import pageObjects.GetStartedPage;
//import pageObjects.HomePage;
import numpyninja.dsalgo.pageObjects.QueuePage;
import numpyninja.dsalgo.pageObjects.SignInPage;
import numpyninja.dsalgo.pageObjects.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import numpyninja.dsalgo.utilities.ExcelUtils;
import numpyninja.dsalgo.utilities.LoginDetails;
import numpyninja.dsalgo.webdriver_manager.DriverManager;


public class QueueStepDefinition extends BaseClass{
	
		@Given("the user has logged in")
	    public void the_user_is_logged_in() {
	    	loginPage = new LoginPage(DriverManager.getDriver());
	    	queuePage = new QueuePage(DriverManager.getDriver());
	    	signIn = new SignInPage(DriverManager.getDriver());
            signIn.navigateSignIn();
			signIn.clickSignIn();
			signIn.ValidCredentials();
			signIn.clickLogin();
	    }	
		
		@When("The user writes the valid python code in Editor and clicks Run button")
		public void the_good_code_is_run() {
			queuePage.enterValidCode();
		}

		@Then("The user  should be able to see the output in the console")
		public void the_user_is_able_to_see_the_output_inside_the_console() {
			boolean result = queuePage.ValidateOutput();
			Assert.assertTrue(result);
		}

		@When("The user writes the inValid python code in Editor and Clicks Run button")
		public void the_user_writes_the_invalid_python_code() {
			queuePage.enterInValidCode();
		}

		@When("The user Clicks Run button")
		public void the_user_writes_no_code() {
			queuePage.run();
		}

		@Then("The User should should be in the same page with the error messages")
		public void the_user_should_see_an_error_message_in_alert_window() {
			boolean result = queuePage.alertMsgIsDisplayed();
			Assert.assertTrue(result);
		}

	    @When("the {string} link is pressed on {string}")
	    public void the_num_test_is_run(String link, String from) {
	    	DriverManager.getDriver().get(getPageUrl(from));
	    	getAnchor(link).click();
	    }
	    
	    @Then("the expected {string} page should open")
	    public void the_expected_num_page_should_load(String page) {
	    	if (page.equals("Practice"))
	    		Assert.assertTrue(false);
	    	else
	    		Assert.assertEquals(getPageUrl(page), DriverManager.getDriver().getCurrentUrl());
	    }
	    
	    private WebElement getAnchor(String link) {
	        switch (link) {
	        	case "Queue":
	                return queuePage.getStarted;
	            case "Implementation of Queue in Python":
	                return queuePage.implementationOfQueueInPython;
	            case "Implementation using collections.deque":
	                return queuePage.implementationUsingCollectionsDeque;
	            case "Implementation using array":
	                return queuePage.implementationUsingArray;
	            case "Queue Operations":
	                return queuePage.queueOperations;
	            case "Practice":
	                return queuePage.practice;
	            case "Editor":
	                return queuePage.editor;
	            default:
	                return new RemoteWebElement(); // return default RemoteWebElement if not found
	        }
	    }

	    private String getPageUrl(String pageName) {
	        switch (pageName) {
	        	case "Home":
	        		return "https://dsportalapp.herokuapp.com/home";
	        	case "Queue":
	                return "https://dsportalapp.herokuapp.com/queue/";
	            case "Implementation of Queue in Python":
	                return "https://dsportalapp.herokuapp.com/queue/implementation-lists/";
	            case "Implementation using collections.deque":
	                return "https://dsportalapp.herokuapp.com/queue/implementation-collections/";
	            case "Implementation using array":
	                return "https://dsportalapp.herokuapp.com/queue/Implementation-array/";
	            case "Queue Operations":
	                return "https://dsportalapp.herokuapp.com/queue/QueueOp/";
	            case "Editor":
	                return "https://dsportalapp.herokuapp.com/tryEditor";
	            case "Practice":
	                return "https://dsportalapp.herokuapp.com/queue/practice/";
	            default:
	                return "";
	        }
	    }
	}