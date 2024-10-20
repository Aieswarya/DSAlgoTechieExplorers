package numpyninja.dsalgo.stepDefinitions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.DataStructurePage;
import numpyninja.dsalgo.pageObjects.GetStarted;
import numpyninja.dsalgo.pageObjects.SignInPage;
import numpyninja.dsalgo.pageObjects.StackPage;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class StackStepDefinition {

	WebDriver driver;
	boolean result;
	private static final Logger LOGGER = LogManager.getLogger(StackStepDefinition.class);

	GetStarted gs = new GetStarted(DriverManager.getDriver());
	SignInPage sp = new SignInPage(DriverManager.getDriver());
	StackPage stp = new StackPage(DriverManager.getDriver());
	DataStructurePage ds = new DataStructurePage(DriverManager.getDriver());

	@Given("The user is in DS home page")
	public void the_user_is_in_DS_home_page() {
		LOGGER.info("The user is in DS home page");
	}

	@When("The user clicks the Get Started button in homepage")
	public void the_user_clicks_the_get_started_button_in_homepage() {
		stp.clickStackGetStarted();
		LOGGER.info("The user clicks the Get Started button in homepage of Stack module");
	}

	@Then("The user should be directed to Stack Page")
	public void the_user_should_be_directed_to_stack_page() {
		result = ds.ValidateURL("https://dsportalapp.herokuapp.com/stack/");
		Assert.assertTrue(result);
		LOGGER.info("The user should be directed to Stack Page");
	}

	@Given("The user is in the Stack page")
	public void the_user_is_in_the_stack_page() {
		stp.clickStackGetStarted();
		LOGGER.info("The user is in the Stack page");
	}

	@When("The user clicks Operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {
		stp.clickOperationsinStack();
		LOGGER.info("The user clicks Operations in Stack button");
	}

	@Then("The user should be directed to Operations in Stack Page")
	public void the_user_should_be_directed_to_operations_in_stack_page() {

		result = ds.ValidateURL("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		Assert.assertTrue(result);
		LOGGER.info("The user should be directed to Operations in Stack Page");
	}

	@Given("The user is in the Operations in Stack page")
	public void the_user_is_in_the_operations_in_stack_page() {
		stp.clickStackGetStarted();
		stp.clickOperationsinStack();
		LOGGER.info("The user is in the Operations in Stack page");
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {

		stp.clickTryhere();
		LOGGER.info("The user clicks Try Here button");
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() {

		result = ds.ValidateURL("https://dsportalapp.herokuapp.com/tryEditor");
		Assert.assertTrue(result);
		LOGGER.info("The user should be redirected to a page having an tryEditor with a Run button");

	}

	@When("The user clicks Implementation button")
	public void the_user_clicks_implementation_button() {

		stp.clickImplementation();
		LOGGER.info("The user clicks Implementation button");

	}

	@Then("The user should be directed to Implementation Page")
	public void the_user_should_be_directed_to_implementation_page() {

		result = ds.ValidateURL("https://dsportalapp.herokuapp.com/stack/implementation/");
		Assert.assertTrue(result);
		LOGGER.info("The user should be directed to Implementation Page");

	}

	@Given("The user is in the Implementation page")
	public void the_user_is_in_the_implementation_page() {
		stp.clickStackGetStarted();
		stp.clickImplementation();
		LOGGER.info("The user is in the Implementation page");

	}

	@When("The user clicks Application button")
	public void the_user_clicks_application_button() {
		stp.clickApplications();
		LOGGER.info("The user clicks Application button");

	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {

		result = ds.ValidateURL("https://dsportalapp.herokuapp.com/stack/stack-applications/");
		Assert.assertTrue(result);
		LOGGER.info("The user should be directed to Applications Page");

	}

	@Given("The user is in the Applications page")
	public void the_user_is_in_the_applications_page() {

		stp.clickStackGetStarted();
		stp.clickApplications();
		LOGGER.info("The user is in the Applications page");
	}

	@Given("The user is on any stack {string} python Editor page")
	public void the_user_is_on_any_stack_python_editor_page(String type) {

		System.out.println("I have entered inside switch ");
		switch (type) {
		case ("Operationsinstack"):
			System.out.println("I am inside Operation in stack");

			stp.clickStackGetStarted();
			System.out.println("Clicked Stack Get Started");

			stp.clickOperationsinStack();
			System.out.println("Clicked OperationsinStack");

			stp.clickTryhere();
			System.out.println("Clicked Tryhere");
			break;

		case ("Implementation"):
			stp.clickStackGetStarted();
			stp.clickImplementation();
			stp.clickTryhere();
			break;

		case ("Applications"):
			stp.clickStackGetStarted();
			stp.clickApplications();
			stp.clickTryhere();
			break;
		}
		LOGGER.info("The user is on any stack python Editor page");

	}

	@When("The User writes Valid python code")
	public void the_user_writes_valid_python_code() {
		ds.enterValidCode();
		LOGGER.info("The User writes Valid python code");

	}

	@When("click Run button")
	public void click_run_button() {
		stp.clickRun();
		LOGGER.info("click Run button");

	}

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {

		result = ds.ValidateOutput();
		Assert.assertTrue(result);
		LOGGER.info("The user is able to see the output in the console");
	}

	@When("the user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
		ds.enterInValidCode();
		LOGGER.info("the user writes invalid python code for stack module");
	}

	@Given("The user is on any stack {string} editor page with Alert error message")
	public void the_user_is_on_any_stack_editor_page_with_alert_error_message(String type) {

		switch (type) {
		case ("Operationsinstack"):
			System.out.println("I am inside Operation in stack");

			stp.clickStackGetStarted();
			stp.clickOperationsinStack();
			stp.clickTryhere();
			ds.enterInValidCode();
			ds.clickRun();
			break;

		case ("Implementation"):
			stp.clickStackGetStarted();
			stp.clickImplementation();
			stp.clickTryhere();
			ds.enterInValidCode();
			ds.clickRun();
			break;

		case ("Applications"):
			stp.clickStackGetStarted();
			stp.clickApplications();
			stp.clickTryhere();
			ds.enterInValidCode();
			ds.clickRun();
			break;
		}
		LOGGER.info("The user is on any stack editor page with Alert error message");
	}

	@Then("The user should see an error message displayed")
	public void the_user_should_see_an_error_message_displayed() {

		ds.alertMsgIsDisplayed();
		LOGGER.info("The user should see an error message displayed");

	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {

		stp.clickImplementation();
		stp.clickPracticeQuestions();
		LOGGER.info("The user clicks Practice Questions link");
	}

	@Then("The user should see content in Practice questions page")
	public void the_user_should_see_content_in_practice_questions_page() {

		result = ds.ValidateURL("https://dsportalapp.herokuapp.com/stack/practice");
		Assert.assertFalse(result);
		LOGGER.info("The user should see content in Practice questions page");

	}

}
