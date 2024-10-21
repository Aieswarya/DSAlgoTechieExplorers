package numpyninja.dsalgo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.GetStarted;
import numpyninja.dsalgo.pageObjects.HomePage;
import numpyninja.dsalgo.pageObjects.SignInPage;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class HomePageStepDefinition {

	private static final Logger LOGGER = LogManager.getLogger(HomePageStepDefinition.class);

	HomePage hp = new HomePage(DriverManager.getDriver());

	SignInPage si = new SignInPage(DriverManager.getDriver());
	GetStarted gs= new GetStarted(DriverManager.getDriver());

	@Given("The user is on DS HomePage")
	public void the_user_is_on_ds_home_page() {

		hp.clickgetstartedbtn();
		LOGGER.info("The user is on DS HomePage");
	}

	/*********************
	 * First Scenario
	 ******************************************************************************************/

	@When("The user clicks the data structure\"dropdown  arrow")
	public void the_user_clicks_the_data_structure_dropdown_arrow() {

		hp.dropdown();
		LOGGER.info("The user clicks the data structure\\\"dropdown  arrow");
	}

	@Then("The user should able to see {int} options {string} in dropdown menu")
	public void the_user_should_able_to_see_options_in_dropdown_menu(Integer int1, String string) {

		boolean result = hp.getdropdownoptions(int1, string);
		// boolean result = true;
		Assert.assertTrue(result);
		LOGGER.info("The user is able verify dropdown functionality in homepage");
	}

	/*********************
	 * Common When for fourth and Fifth scenario, Common Then for Second and Third
	 * Scenario
	 ********************************************************************************/

	@When("The user selects {string} data structures item from the drop down")
	public void the_user_selects_data_structures_item_from_the_drop_down(String type) {

		switch (type) {

		case "Array":
			hp.ddarraybtn();
			break;
		case "Linked List":
			hp.ddlinkedListbtn();
			break;
		case "Stack":
			hp.ddstackbtn();
			break;
		case "Queue":
			hp.ddqueuebtn();
			break;
		case "Tree":
			hp.ddtreebtn();
			break;
		case "Graph":
			hp.ddgraphbtn();
			break;
		default:
			System.out.println("Unable to find this topic....");
			break;
		}
		LOGGER.info("The user selects data structures item from the drop down");

	}

	@When("The user clicks {string} Get Started buttons of data structures  on the DSIntroduction page")
	public void the_user_clicks_get_started_buttons_of_data_structures_on_the_ds_introduction_page(String type) {

		switch (type) {

		case "Array":
			hp.arraygsbtn();
			break;
		case "Linked List":
			hp.linkedlistgs();
			break;
		case "Stack":
			hp.stackgsbtn();
			break;
		case "Queue":
			hp.queuegs();
			break;
		case "Tree":
			hp.treegsbtn();
			break;
		case "Graph":
			hp.graphgsbtn();
			break;
		default:
			System.out.println("Unable to find this topic....");
			break;
		}
		LOGGER.info("The user checks navigation to DS page from Get Started options in home page");

	}

	// Common assertion for second and third scenario
	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) {
		boolean result = hp.VerifyWarningMsg();
		Assert.assertTrue(result);
		LOGGER.info("The user checks warning message is displayed");

	}

	/******************************
	 * Fourth and Fifth Scenario
	 ********************************************************************/

	@Given("The user is on DSHomePage with sign in")
	public void the_user_is_on_ds_home_page_with_sign_in() {
	//	si.gotologinPg();
	//	si.PassCredentials();
		gs.clickgetstartedbtn();
		si.clickSignIn();
		si.ValidCredentials();
		si.clickLogin();
		LOGGER.info("The user is on DSHomePage with sign in");
	}

	@Then("The user is redirected to correct Data Structure {string} page")
	public void the_user_is_redirected_to_correct_data_structure_page(String type) {
		boolean result = false;
		switch (type) {
		case ("Data Structures-Introduction"):
			result = hp.DSIntroPageIsDisplayed();
			Assert.assertTrue(result);
			break;
		case ("Array"):
			result = hp.ArrayPageIsDisplayed();
			Assert.assertTrue(result);
			break;
		case ("Linked List"):
			result = hp.LLPageIsDisplayed();
			Assert.assertTrue(result);
			break;
		case ("Stack"):
			result = hp.StackPageIsDisplayed();
			Assert.assertTrue(result);
			break;
		case ("Tree"):
			result = hp.TreePageIsDisplayed();
			Assert.assertTrue(result);
			break;
		case ("Graph"):
			result = hp.GraphPageIsDisplayed();
			Assert.assertTrue(result);
			break;
		case ("Queue"):
			result = hp.QueuePageIsDisplayed();
			Assert.assertTrue(result);
			break;
		}
		LOGGER.info("The user is redirected to correct Data Structure page");
	}

	/************************************
	 * Sixth Scenario
	 *****************************************************/
	@When("The user clicks Numpy Ninja link from any Data Structure {string} page")
	public void the_user_clicks_numpy_ninja_link_from_any_data_structure_page(String type) {

		switch (type) {

		case "Array":
			hp.arraygsbtn();
			hp.clickNumpyNinja();
			break;
		case "Linked List":
			hp.linkedlistgs();
			hp.clickNumpyNinja();
			break;
		case "Stack":
			hp.stackgsbtn();
			hp.clickNumpyNinja();
			break;
		case "Queue":
			hp.queuegs();
			hp.clickNumpyNinja();
			break;
		case "Tree":
			hp.treegsbtn();
			hp.clickNumpyNinja();
			break;
		case "Graph":
			hp.graphgsbtn();
			hp.clickNumpyNinja();
			break;
		default:
			System.out.println("Unable to find this type....");
			break;
		}
		LOGGER.info("The user clicks Numpy Ninja link from any Data Structure page");

	}

	@Then("The user is redirected to Get Started page")
	public void the_user_is_redirected_to_get_started_page() {
		boolean result = hp.GetStartedPageIsDisplayed();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Get Started page");

	}

}