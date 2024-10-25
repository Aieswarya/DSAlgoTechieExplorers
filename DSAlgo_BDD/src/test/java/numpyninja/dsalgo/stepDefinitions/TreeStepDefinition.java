package numpyninja.dsalgo.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pagefactory.Graph;
import numpyninja.dsalgo.pagefactory.HomePage;
import numpyninja.dsalgo.pagefactory.Tree;
import numpyninja.dsalgo.webdriver_manager.DriverManager;

public class TreeStepDefinition {

	Tree tt = new Tree(DriverManager.getDriver());
	HomePage hp = new HomePage(DriverManager.getDriver());
	Graph gp = new Graph(DriverManager.getDriver());
	private static final Logger LOGGER = LogManager.getLogger(TreeStepDefinition.class);

	@Given("The user is on the Tree home page")
	public void the_user_is_on_the_tree_home_page() {
		hp.treegsbtn();
		LOGGER.info("The user is on the Tree home page");
	}

	@When("The user clicks Overview of Trees")
	public void the_user_clicks_overview_of_trees() {
		tt.click_Overview_of_trees();
		LOGGER.info("The user clicks Overview of Trees");
	}

	@Then("The user should be redirected to Overview of Trees page.")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
		boolean result = tt.Validate_OverviewOfTreePage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Overview of Trees page.");
	}

	@Given("The user is on the Overview of Trees page")
	public void the_user_is_on_the_overview_of_trees_page() {
		hp.treegsbtn();
		tt.click_Overview_of_trees();
		LOGGER.info("The user is on the Overview of Trees page.");
	}

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
		tt.click_TypesOfTrees();
		LOGGER.info("The user clicks Types of Trees link");

	}

	@Then("The user should be redirected to Types of Trees page.")
	public void the_user_should_be_redirected_to_types_of_trees_page() {
		boolean result = tt.Validate_TypesofTreesPage();
		Assert.assertTrue(result);
		LOGGER.info("he user is redirected to Types of Trees page.");

	}

	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {
		hp.treegsbtn();
		tt.click_TypesOfTrees();
		LOGGER.info("The user is on the Types of Trees page");
	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		tt.click_Terminoloies();
		LOGGER.info("The user clicks Terminologies link");
	}

	@Then("The user should be redirected to Terminologies page.")
	public void the_user_should_be_redirected_to_terminologies_page() {
		boolean result = tt.Validate_TerminologiesPage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Terminologies page.");

	}

	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		hp.treegsbtn();
		tt.click_Terminoloies();
		LOGGER.info("The user is on the Terminologies page");
	}

	@When("The user clicks on the Tree Traversal link")
	public void the_user_clicks_on_the_tree_traversal_link() {
		tt.click_TreeTraversals();
		LOGGER.info("The user clicks on the Tree Traversal link");
	}

	@Then("The user should be redirected to Tree Traversal page.")
	public void the_user_should_be_redirected_to_tree_traversal_page() {
		boolean result = tt.Validate_TreeTraversalsPage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Tree Traversal page.");
	}

	@Given("The user is on the Tree Traversal Python page")
	public void the_user_is_on_the_tree_traversal_python_page() {
		hp.treegsbtn();
		tt.click_TreeTraversals();
		LOGGER.info("The user is on Tree Traversal page.");
	}

	@When("The user clicks Traversal Illustration link")
	public void the_user_clicks_traversal_illustration_link() {
		tt.click_TraversalsIllustrations();
		LOGGER.info("The user clicks Traversal Illustration link");
	}

	@Then("The user should be redirected to Traversal Illustration page.")
	public void the_user_should_be_redirected_to_traversal_illustration_page() {
		boolean result = tt.Validate_TraversalsIllustrationPage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Traversal Illustration page.");
	}

	@Given("The user is on the Traversal Illustration page")
	public void the_user_is_on_the_traversal_illustration_page() {
		hp.treegsbtn();
		tt.click_TraversalsIllustrations();
		LOGGER.info("The user is on the Traversal Illustration page");
	}

	@When("The user clicks Binary Tree link")
	public void the_user_clicks_binary_tree_link() {
		tt.click_BinaryTree();
		LOGGER.info("The user clicks Binary Tree link");
	}

	@Then("The user should be redirected to Binary Tree page.")
	public void the_user_should_be_redirected_to_binary_tree_page() {
		boolean result = tt.Validate_BinaryTreePage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Binary Tree page");
	}

	@Given("The user is on the Binary Tree page")
	public void the_user_is_on_the_binary_tree_page() {
		hp.treegsbtn();
		tt.click_BinaryTree();
		LOGGER.info("The user is on the Binary Tree page");
	}

	@When("The user clicks Types of Binary Tree link")
	public void the_user_clicks_types_of_binary_tree_link() {
		tt.click_TypesOfBinaryTree();
		LOGGER.info("The user clicks Types of Binary Tree link");
	}

	@Then("The user should be redirected to Types of Binary Tree page.")
	public void the_user_should_be_redirected_to_types_of_binary_tree_page() {
		boolean result = tt.Validate_TypesOfBinaryTreePage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Types of Binary Tree page");
	}

	@Given("The user is on the Types of Binary Tree page")
	public void the_user_is_on_the_types_of_binary_tree_page() {
		hp.treegsbtn();
		tt.click_TypesOfBinaryTree();
		LOGGER.info("The user is on the Types of Binary Tree page");
	}

	@When("The user clicks Types of Implementation of Binary Tree link")
	public void the_user_clicks_types_of_implementation_of_binary_tree_link() {
		tt.click_ImplementationOfBinaryTrees();
		LOGGER.info("The user clicks Types of Implementation of Binary Tree link");
	}

	@Then("The user should be redirected to Implementation of Binary Tree page.")
	public void the_user_should_be_redirected_to_implementation_of_binary_tree_page() {
		boolean result = tt.Validate_ImplementationOfBinaryTreesPage();
		Assert.assertTrue(result);
	}

	@Given("The user is on the Types of Implementation of Binary Tree page")
	public void the_user_is_on_the_types_of_implementation_of_binary_tree_page() {
		hp.treegsbtn();
		tt.click_ImplementationOfBinaryTrees();
		LOGGER.info("The user is on the Types of Implementation of Binary Tree page");
	}

	@When("The user clicks Types of Application of Binary Tree link")
	public void the_user_clicks_types_of_application_of_binary_tree_link() {
		tt.click_ApplicationsofBinaryTree();
		LOGGER.info("The user clicks Types of Application of Binary Tree link");

	}

	@Then("The user should be redirected to Application of Binary Treepage.")
	public void the_user_should_be_redirected_to_application_of_binary_treepage() {
		boolean result = tt.Validate_ApplicationOfBinaryTreesPage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Application of Binary Treepage.");
	}

	@Given("The user is on the Types of Application of Binary Tree page")
	public void the_user_is_on_the_types_of_application_of_binary_tree_page() {
		hp.treegsbtn();
		tt.click_ApplicationsofBinaryTree();
		LOGGER.info("The user is on the Types of Application of Binary Tree page");
	}

	@When("The user clicks Types of Binary Search Tree link")
	public void the_user_clicks_types_of_binary_search_tree_link() {
		tt.click_BinarySearchTree();
		LOGGER.info("The user clicks Types of Binary Search Tree link");
	}

	@Then("The user should be redirected to Binary Search Tree page.")
	public void the_user_should_be_redirected_to_binary_search_tree_page() {
		boolean result = tt.Validate_BinarySearchTreePage();
		Assert.assertTrue(result);
		LOGGER.info("The user is redirected to Binary Search Tree page.");
	}

	@Given("The user is on the Binary Search Tree page")
	public void the_user_is_on_the_binary_search_tree_page() {
		hp.treegsbtn();
		tt.click_BinarySearchTree();
		LOGGER.info("The user is on the Binary Search Tree page");
	}

	@When("The user clicks Types of Implementation of BST link")
	public void the_user_clicks_types_of_implementation_of_bst_link() {
		tt.click_ImplementationOfBST();
		LOGGER.info("The user clicks Types of Implementation of BST link");
	}

	@Then("The user should be redirected to Implementation of BST page.")
	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
		boolean result = tt.Validate_ImplementationOfBST();
		Assert.assertTrue(result);
		LOGGER.info("The user should be redirected to Implementation of BST page.");
	}

	@Given("The user is on the Implementation of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {
		hp.treegsbtn();
		tt.click_ImplementationOfBST();
		LOGGER.info("The user is on the Implementation of BST page");
	}

	@Given("The user is on any Tree {string} Python Editor")
	public void the_user_is_on_any_tree_python_editor(String string) {
		hp.treegsbtn();
		switch (string) {
		case ("Overview of Trees"):
			tt.click_Overview_of_trees();
			gp.clickTryHere();
			break;
		case ("Terminologies"):
			tt.click_Terminoloies();
			gp.clickTryHere();
			break;
		case ("Types of Trees"):
			tt.click_TypesOfTrees();
			gp.clickTryHere();
			break;
		case ("Tree Traversals"):
			tt.click_TreeTraversals();
			gp.clickTryHere();
			break;
		case ("Traversals-Illustration"):
			tt.click_TraversalsIllustrations();
			gp.clickTryHere();
			break;
		case ("Binary Trees"):
			tt.click_BinaryTree();
			gp.clickTryHere();
			break;
		case ("Types of Binary Trees"):
			tt.click_TypesOfBinaryTree();
			gp.clickTryHere();
			break;
		case ("Implementation in Python"):
			tt.click_ImplementationInPython();
			gp.clickTryHere();
			break;
		case ("Binary Tree Traversals"):
			tt.click_BinaryTreeTraversals();
			gp.clickTryHere();
			break;
		case ("Implementation of Binary Trees"):
			tt.click_ImplementationOfBinaryTrees();
			gp.clickTryHere();
			break;
		case ("Application of Binary Trees"):
			tt.click_ApplicationsofBinaryTree();
			gp.clickTryHere();
			break;
		case ("Binary Search Tree"):
			tt.click_BinarySearchTree();
			gp.clickTryHere();
			break;
		case ("Implementation of BST"):
			tt.click_ImplementationOfBST();
			gp.clickTryHere();
			break;

		}
		LOGGER.info("The user is on any Tree  Python Editor");
	}

	@Given("The user is on any Tree {string} Python Editor page with Alert  error message")
	public void the_user_is_on_any_tree_python_editor_page_with_alert_error_message(String string) {
		hp.treegsbtn();
		switch (string) {
		case ("Overview of Trees"):
			tt.click_Overview_of_trees();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Terminologies"):
			tt.click_Terminoloies();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Types of Trees"):
			tt.click_TypesOfTrees();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Tree Traversals"):
			tt.click_TreeTraversals();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Traversals-Illustration"):
			tt.click_TraversalsIllustrations();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Binary Trees"):
			tt.click_BinaryTree();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Types of Binary Trees"):
			tt.click_TypesOfBinaryTree();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Implementation in Python"):
			tt.click_ImplementationInPython();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Binary Tree Traversals"):
			tt.click_BinaryTreeTraversals();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Implementation of Binary Trees"):
			tt.click_ImplementationOfBinaryTrees();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Application of Binary Trees"):
			tt.click_ApplicationsofBinaryTree();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Binary Search Tree"):
			tt.click_BinarySearchTree();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;
		case ("Implementation of BST"):
			tt.click_ImplementationOfBST();
			gp.clickTryHere();
			gp.enterInValidCode();
			gp.clickRun();
			break;

		}
		LOGGER.info("The user is on any Tree Python Editor page with Alert  error message");
	}

	@When("The user clicks Practice Questions link in any Tree page")
	public void the_user_clicks_practice_questions_link_in_any_tree_page() {
		tt.click_BinaryTree();
		tt.click_PractiseQuestions();
		LOGGER.info("The user clicks Practice Questions link in any Tree page");
	}

}
