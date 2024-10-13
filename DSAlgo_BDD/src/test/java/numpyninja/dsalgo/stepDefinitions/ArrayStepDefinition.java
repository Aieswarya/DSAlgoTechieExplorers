package numpyninja.dsalgo.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.ArrayPage;
import numpyninja.dsalgo.pageObjects.LoginPage;
import numpyninja.dsalgo.utilities.ExcelUtils;
import numpyninja.dsalgo.utilities.LoginDetails;
import numpyninja.dsalgo.utilities.Testcase;
import numpyninja.dsalgo.webdriver_manager.DriverManager;


public class ArrayStepDefinition extends BaseClass {
	
	@Given("the user is logged in")
    public void the_user_is_logged_in() {
    	loginPage = new LoginPage(DriverManager.getDriver());
    	arrayPage = new ArrayPage(DriverManager.getDriver());
    	LoginDetails details = ExcelUtils.getLogin();
    	
    	DriverManager.getDriver().get("https://dsportalapp.herokuapp.com/login");
        loginPage.SetUserName(details.userName);
        loginPage.SetPassword(details.password);
        loginPage.ClickBtnLogin();
    }
	
	@When("the good code is run")
	public void the_good_code_is_run() {
		DriverManager.getDriver().get(getPageUrl("Editor"));
		Testcase t = ExcelUtils.getTestcase(1);
		arrayPage.pythonEditor.sendKeys(t.input);
		arrayPage.pythonRun.click();
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

    
    