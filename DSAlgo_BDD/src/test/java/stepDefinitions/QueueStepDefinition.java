package stepDefinitions;

import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.DataStructurePage;
//import pageObjects.GetStartedPage;
//import pageObjects.HomePage;
import pageObjects.QueuePage;
import pageObjects.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.ExcelUtils;
import utilities.Helper;
import utilities.LoginDetails;
import utilities.Testcase;


public class QueueStepDefinition extends BaseClass{
	
		@Given("zthe user is logged in")
	    public void the_user_is_logged_in() {
	    	loginPage = new LoginPage(Helper.driver);
	    	queuePage = new QueuePage(Helper.driver);
	    	LoginDetails details = ExcelUtils.getLogin();
	    	
	        Helper.driver.get("https://dsportalapp.herokuapp.com/login");
	        loginPage.SetUserName(details.userName);
	        loginPage.SetPassword(details.password);
	        loginPage.ClickBtnLogin();
	    }
		
		/*@When("the good code is run")
		public void the_good_code_is_run() {
			Helper.driver.get(getPageUrl("Editor"));
			Testcase t = ExcelUtils.getTestcase(1);
			arrayPage.pythonEditor.sendKeys(t.input);
			arrayPage.pythonRun.click(); 
		} */
		
		
		

	    @When("zthe {string} link is clicked on {string}")
	    public void the_num_test_is_run(String link, String from) {
	    	Helper.driver.get(getPageUrl(from));
	    	getAnchor(link).click();
	    }
	    
	    @Then("zthe expected {string} page should load")
	    public void the_expected_num_page_should_load(String page) {
	    	Assert.assertEquals(getPageUrl(page), Helper.driver.getCurrentUrl());
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
	            case "Queue":
	                return "https://dsportalapp.herokuapp.com/queue";
	            case "Implementation of Queue in Python":
	                return "https://dsportalapp.herokuapp.com/queue/python";
	            case "Implementation using collections.deque":
	                return "https://dsportalapp.herokuapp.com/queue/collections";
	            case "Implementation using array":
	                return "https://dsportalapp.herokuapp.com/queue/array";
	            case "Queue Operations":
	                return "https://dsportalapp.herokuapp.com/queue/operations";
	            case "Editor":
	                return "https://dsportalapp.herokuapp.com/tryEditor";
	            case "Practice":
	                return "https://dsportalapp.herokuapp.com/queue/practice";
	            default:
	                return "";
	        }
	    }
	}