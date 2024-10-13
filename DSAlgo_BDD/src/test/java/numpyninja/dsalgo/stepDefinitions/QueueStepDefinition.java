package numpyninja.dsalgo.stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.DataStructurePage;
//import pageObjects.GetStartedPage;
//import pageObjects.HomePage;
import numpyninja.dsalgo.pageObjects.QueuePage;
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
	    	LoginDetails details = ExcelUtils.getLogin();
	    	
	    	DriverManager.getDriver().get("https://dsportalapp.herokuapp.com/login");
	        loginPage.SetUserName(details.userName);
	        loginPage.SetPassword(details.password);
	        loginPage.ClickBtnLogin();
	    }	

	    @When("the {string} link is pressed on {string}")
	    public void the_num_test_is_run(String link, String from) {
	    	DriverManager.getDriver().get(getPageUrl(from));
	    	getAnchor(link).click();
	    }
	    
	    @Then("the expected {string} page should open")
	    public void the_expected_num_page_should_load(String page) {
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