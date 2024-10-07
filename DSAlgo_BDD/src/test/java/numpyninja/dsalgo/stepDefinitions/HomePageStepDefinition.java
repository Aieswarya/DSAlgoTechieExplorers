package numpyninja.dsalgo.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import numpyninja.dsalgo.pageObjects.HomePage;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;



public class HomePageStepDefinition {
	
	//HomePage hp = new HomePage();
	
	
	@Given("The user is on the DS Algo home page")
	public void the_user_should_open_the_ds_algo_portal_in_browser() {
		
		
	    
	}

	@When("The user clicks the data structure\"dropdown  arrow")
	public void the_user_clicks_the_data_structure_dropdown_arrow() {
		 
	   	}

	@Then("The user should able to see {int} options {string} in dropdown menu")
	public void the_user_should_able_to_see_options_arrays_in_dropdown_menu(Integer int1, String string) {
	  // boolean result =homepage.getdropdownoptions(int1, string);
	   //Assert.assertTrue(result);
	
	}
   /*********************Second Scenario **********************************/
	@Given("The user is on DSIntroduction Page to select dd")
	public void the_user_is_on_ds_introduction_page_to_select_dd() {
	   
	}

	@When("The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	    
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) {
	    
	}
   /******************************Third Scenario ***************************************************************/
	@Given("The user is on DS Introduction Page without sign in")
	public void the_user_is_on_ds_introduction_page_without_sign_in() {
	    
	}

	@When("The user clicks any {string} buttons of data structures  on the DSIntroduction page without sign in")
	public void the_user_clicks_any_buttons_of_data_structures_on_the_ds_introduction_page_without_sign_in(String string) {
	    
	}
   /*************************************Fourth Scenario*******************************************************/
	@Given("The user is on DSIntroduction Page to select any option")
	public void the_user_is_on_ds_introduction_page_to_select_any_option() {
	    
	}

	@When("The user selects any data structures item from the drop down with Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_with_sign_in() {
	    
	}

	@Then("The user landed on DSAlgo respective Data Structure page with message {string}")
	public void the_user_landed_on_ds_algo_respective_data_structure_page_with_message(String string) {
	    
	}
   /***************************************Fifth Scenario 8***************************************/
	@Given("The user is on DSIntroduction Page with sign in")
	public void the_user_is_on_ds_introduction_page_with_sign_in() {
	    
	}

	@When("The user clicks any {string} buttons of data structures  on the DSIntroduction page with sign in")
	public void the_user_clicks_any_buttons_of_data_structures_on_the_ds_introduction_page_with_sign_in(String string) {
	    
	}



  

}
