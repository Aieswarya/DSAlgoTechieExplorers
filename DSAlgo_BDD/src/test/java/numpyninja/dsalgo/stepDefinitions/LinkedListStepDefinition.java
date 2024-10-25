package numpyninja.dsalgo.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pagefactory.Graph;
import numpyninja.dsalgo.pagefactory.HomePage;
import numpyninja.dsalgo.pagefactory.LinkedList;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class LinkedListStepDefinition {

	LinkedList ll = new LinkedList(DriverManager.getDriver());
	HomePage hp = new HomePage(DriverManager.getDriver());
	Graph gp = new Graph(DriverManager.getDriver());
	private static final Logger LOGGER = LogManager.getLogger(HomePageStepDefinition.class);

	@Given("The user is on the Linked List home page")
	public void the_user_is_on_the_linked_list_home_page() {
		hp.linkedlistgs();
		LOGGER.info("The User is on Linked List Home Page");
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		ll.click_llIntro_link();
		LOGGER.info("The user clicks Introduction link");
	}

	@Then("The user should be redirected to LL Introduction page.")
	public void the_user_should_be_redirected_to_ll_introduction_page() {
		boolean result = ll.Validate_LLIntro_URL();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to LL Introduction page.");

	}

	@Given("The user is on the LL Introduction page")
	public void the_user_is_on_the_ll_introduction_page() {
		hp.linkedlistgs();
		ll.click_llIntro_link();
		LOGGER.info("The user is on the LL Introduction page.");
	}

	@When("The user clicks Creating Linked List link")
	public void the_user_clicks_creating_linked_list_link() {
		ll.click_Createll_link();
		LOGGER.info("The user clicks Creating Linked List link");
	}

	@Then("The user should be redirected to Creating Linked List page.")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
		boolean result = ll.Validate_CreateLL_URL();
		Assert.assertTrue(result);
		LOGGER.info("TThe user is redirected to Creating Linked List page.");
	}

	@Given("The user is on the Creating Linked LIst page")
	public void the_user_is_on_the_creating_linked_lIst_page() {
		hp.linkedlistgs();
		ll.click_Createll_link();

		LOGGER.info("The user is on the Creating Linked LIst page");

	}

	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
		ll.click_Typeofll_link();
		LOGGER.info("The user clicks Types of Linked List link");

	}

	@Then("The user should be redirected to Types of Linked List page.")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() {
		boolean result = ll.Validate_TypesOfLL_URL();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Types of Linked List page");
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
		hp.linkedlistgs();
		ll.click_Typeofll_link();
		LOGGER.info("The user is on the Types of Linked List page");
	}

	@When("The user clicks on the Implement Linked List in LL Home  page")
	public void the_user_clicks_on_the_implement_linked_list_in_ll_home_page() {

		ll.click_Implementll_link();
		LOGGER.info("The user clicks on the Implement Linked List in LL Home  page");

	}

	@Then("The user should be redirected to Implement Linked List in Python page.")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {
		boolean result = ll.Validate_ImplementLL_URL();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Implement Linked List in Python page.");
	}

	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {
		hp.linkedlistgs();
		ll.click_Implementll_link();
		LOGGER.info("The user is on the Implement Linked List in Python page");
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {

		ll.click_Traversell_link();
		LOGGER.info("The user clicks Traversal link");

	}

	@Then("The user should be redirected to Traversal LL page.")
	public void the_user_should_be_redirected_to_traversal_ll_page() {
		boolean result = ll.Validate_TraverseLL_URL();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Traversal LL page.");

	}

	@Given("The user is on the Traversal LL page")
	public void the_user_is_on_the_traversal_ll_page() {
		hp.linkedlistgs();
		ll.click_Traversell_link();
		LOGGER.info("The user is on the Traversal LL page.");

	}

	@When("The user clicks InsertionLL link")
	public void the_user_clicks_insertion_ll_link() {
		ll.click_Insertll_link();
		LOGGER.info("The user clicks InsertionLL link");

	}

	@Then("The user should be redirected to Insertion LL page.")
	public void the_user_should_be_redirected_to_insertion_ll_page() {

		boolean result = ll.Validate_InsertLL_URL();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Insertion LL page");

	}

	@Given("The user is on the Insertion LL page")
	public void the_user_is_on_the_insertion_ll_page() {

		hp.linkedlistgs();
		ll.click_Insertll_link();
		LOGGER.info("The user is on the Insertion LL page");

	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		ll.click_Deletell_link();
		LOGGER.info("The user clicks Deletion link");
	}

	@Then("The user should be redirected to Deletion LL page.")
	public void the_user_should_be_redirected_to_deletion_ll_page() {
		boolean result = ll.Validate_DeleteLL_URL();
		Assert.assertTrue(result);
		LOGGER.info("The user should be redirected to Deletion LL page.");

	}

	@Given("The user is on the Deletion LL page")
	public void the_user_is_on_the_deletion_ll_page() {
		hp.linkedlistgs();
		ll.click_Deletell_link();
		LOGGER.info("The user is on the Deletion LL page");

	}

	@Given("The user is on any LL {string} Python Editor")
	public void the_user_is_on_any_ll_python_editor(String type) {
		System.out.println("I have entered inside switch ");
		switch (type) {

		case ("Introduction"):
			System.out.println("I inside Introduction ");
			hp.linkedlistgs();
			ll.click_llIntro_link();
			gp.clickTryHere();
			break;
		case ("Creating Linked List"):
			hp.linkedlistgs();
			ll.click_Createll_link();
			gp.clickTryHere();
			break;
		case ("Types of Linked List"):
			hp.linkedlistgs();
			ll.click_Typeofll_link();
			gp.clickTryHere();
			break;
		case ("Implement Linked List in Python"):
			hp.linkedlistgs();
			ll.click_Implementll_link();
			gp.clickTryHere();
			break;
		case ("Traversal"):
			hp.linkedlistgs();
			ll.click_Traversell_link();
			gp.clickTryHere();
			break;
		case ("Insertion"):
			hp.linkedlistgs();
			ll.click_Insertll_link();
			gp.clickTryHere();
			break;
		case ("Deletion"):
			hp.linkedlistgs();
			ll.click_Deletell_link();
			gp.clickTryHere();
			break;
		}
		LOGGER.info("The user is on any LL Python Editor");

	}

	@Given("The user is on any LL {string}editor page with Alert  error message")
	public void the_user_is_on_any_ll_editor_page_with_alert_error_message(String type) {

		switch (type) {
		case ("Introduction"):
			hp.linkedlistgs();
			ll.click_llIntro_link();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Creating Linked List"):
			hp.linkedlistgs();
			ll.click_Createll_link();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Types of Linked List"):
			hp.linkedlistgs();
			ll.click_Typeofll_link();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Implement Linked List in Python"):
			hp.linkedlistgs();
			ll.click_Implementll_link();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Traversal"):
			hp.linkedlistgs();
			ll.click_Traversell_link();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Insertion"):
			hp.linkedlistgs();
			ll.click_Insertll_link();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Deletion"):
			hp.linkedlistgs();
			ll.click_Deletell_link();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		}
		LOGGER.info("The user is on any LL editor page with Alert  error message");

	}

	@When("The user does not write any code")
	public void the_user_does_not_write_any_code() {
		gp.noCodeEntered();
		LOGGER.info("The user does not write any code");
	}

	@When("The user clicks Practice Questions link in LLhome page")
	public void the_user_clicks_Practice_Questions_link_in_LLhome_page() {
		ll.click_Createll_link();
		ll.clickPractiseQuestions();

		LOGGER.info("The user clicks Practice Questions link in LLhome page");
	}

}
