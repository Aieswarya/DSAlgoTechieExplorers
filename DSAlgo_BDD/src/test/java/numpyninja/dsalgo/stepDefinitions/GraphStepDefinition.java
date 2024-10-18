package numpyninja.dsalgo.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.Graph;
import numpyninja.dsalgo.pageObjects.HomePage;
import numpyninja.dsalgo.pageObjects.SignIn;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class GraphStepDefinition {

	private static final Logger LOGGER = LogManager.getLogger(HomePageStepDefinition.class);

	Graph gp = new Graph(DriverManager.getDriver());
	SignIn si = new SignIn(DriverManager.getDriver());
	HomePage hp = new HomePage(DriverManager.getDriver());

	@Given("The user is on DS Home Page with logged in")
	public void the_user_is_on_DS_Home_Page_with_logged_in() {
		si.gotologinPg();
		si.PassCredentials();
		LOGGER.info("The user is on DS Home page with logged in ");

	}

	/***********************************
	 * Graph Scenarios
	 ***********************************/
	@Given("The user is on the Graph home page")
	public void the_user_is_on_the_graph_home_page() {

		hp.graphgsbtn();
		LOGGER.info("The user is on Graph Home page with logged in ");
	}

	@When("The user clicks {string} graph link")
	public void the_user_clicks_graph_link(String string) {
		gp.clickGraphLk();
		LOGGER.info("The user clicked graph link in Graph Home Page ");

	}

	@Then("The user should be redirected to Graph page.")
	public void the_user_should_be_redirected_to_graph_page() {
		boolean result = gp.graphPgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Graph page from Graph Home Page ");
	}

	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		hp.graphgsbtn();
		gp.clickGraphLk();
		LOGGER.info("The user is on Graph Page ");
	}

	@Given("The user is on the  Graph editor page")
	public void the_user_is_on_the_graph_editor_page() {
		hp.graphgsbtn();
		gp.clickGraphLk();
		gp.clickTryHere();
		LOGGER.info("The user is on the  Graph editor page");
	}

	/************************************************
	 * Graph Representation Scenarios
	 **********************/
	@When("The user clicks {string} GR link")
	public void the_user_clicks_GR_link(String string) {
		gp.clickGrapRepLk();
		LOGGER.info("The user clicks Graph Representation Link");

	}

	@Then("The user should be redirected to Graph Representations page.")
	public void the_user_should_be_redirected_to_graph_representations_page() {
		boolean result = gp.graphRepPgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Graph Representations page");

	}

	@Given("The user is on the Graph Representations page")
	public void the_user_is_on_the_graph_representations_page() {
		hp.graphgsbtn();
		gp.clickGrapRepLk();
		LOGGER.info("The user is on Graph Representations page");

	}

	@Given("The user is on the Graph RepresentationPython Editor")
	public void the_user_is_on_the_graph_representation_python_editor() {
		hp.graphgsbtn();
		gp.clickGrapRepLk();
		gp.clickTryHere();
	}

	@When("The user clicks {string} link in home page")
	public void the_user_clicks_link_in_home_page(String string) {
		gp.clickGraphLk();
		gp.clickPractiseQues();
		LOGGER.info("The user clicks Practise Questions link");

	}

	@Then("The user should see content in Practise Questions page")
	public void The_user_should_see_content_in_Practise_Questions_page() {

		Assert.assertTrue(false);
		LOGGER.info("The user is on Practise Questions Page");

	}

	/**********************************
	 * Common step definitions
	 **********************/

	@When("The user click {string} Run Button")
	public void the_user_click_Run_button(String string) {
		gp.clickRun();
		LOGGER.info("The user clicks Run Button");

	}

	@When("The user clicks {string} Try Here button")
	public void the_user_clicks_Try_Here_button(String string) {
		gp.clickTryHere();
		LOGGER.info("The user clicks Try Here Button");

	}

	@Then("The user should be redirected to a page having Editor and run button")
	public void the_user_should_be_redirected_to_a_page_having_editor_and_run_button() {
		boolean result = gp.editorPgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Python Editor page");
	}

	@Then("The user see error msg in alert window")
	public void the_user_see_error_msg_in_alert_window() {
		boolean result = gp.alertMsgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user sees alert window");
	}

	@When("The user clicks the {string} Button without entring the code in the Editor")
	public void the_user_clicks_the_button_without_entring_the_code_in_the_editor(String string) {
		gp.noCodeEntered();
		LOGGER.info("The user clicks submit button without entering code");

	}

	@When("The user writes the valid python code")
	public void the_user_writes_the_valid_python_code() {
		gp.enterValidCode();
		LOGGER.info("The user clicks submit button after entering valid python code");
	}

	@Then("The user is able to see the output inside the console.")
	public void the_user_is_able_to_see_the_output_inside_the_console() {

		boolean result = gp.ValidateOutput();
		Assert.assertTrue(result);
		LOGGER.info("The user is able to see the output inside the console.");
	}

	@When("The user writes the invalid python code")
	public void the_user_writes_the_invalid_python_code() {
		gp.enterInValidCode();
		LOGGER.info("The user clicks submit button after entering invalid python code");

	}

	@Then("The user should see an error message in alert window")
	public void the_user_should_see_an_error_message_in_alert_window() {
		boolean result = gp.alertMsgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user sees error message in alert window");

	}

	@Then("The user should see an error message displayed")
	public void the_user_should_see_an_error_message_displayed() {
		boolean result = gp.alertMsgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user should see error message when submitting without entering code");
	}

	/****************************************
	 * Alert handling scenario
	 *********************************/
	@Given("The user is on any graph editor page with Alert  error message")
	public void the_user_is_on_any_graph_editor_page_with_alert_error_message() {
		hp.graphgsbtn();
		gp.clickGrapRepLk();
		gp.clickTryHere();
		gp.enterInValidCode();
		gp.clickRun();
		LOGGER.info("The user is on python editor page with alert window on");

	}

	@When("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
		gp.alertMsgIsDisplayed();

		LOGGER.info("The user clicks ok in alert window");
	}

	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
		boolean result = gp.editorPgIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user stays on same python editor page");

	}

}
