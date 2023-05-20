package StepDefinations;

import io.cucumber.java.en.*;

public class SearchSteps {
	@Given("User is open the application")
	public void user_is_open_the_application() {
	   System.out.println("-> User is opened the applicaiton");
	}

	@When("User enters valid productName into search field")
	public void user_enters_valid_product_name_into_search_field() {
	     System.out.println(" -> User entered productName into search field");
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
	    System.out.println(" -> User clicked on Search button ");
	  //  int fail= 9/0;
	}

	@Then("Valid projdct should be displayed in the search result")
	public void valid_projdct_should_be_displayed_in_the_search_result() {
	     System.out.println("-> Valid projdct should be displayed ");
	}

	@When("User enters non-existance Product into search field")
	public void user_enters_non_existance_product_into_search_field() {
	    System.out.println("-> User enters non-existance Product");
	}

	@Then("User should see Proper text {string}")
	public void user_should_see_proper_text(String string) { 
		System.out.println(" -> User should see Proper text");
	}

	@When("User dont enter any produt into search field")
	public void user_dont_enter_any_produt_into_search_field() {
	     System.out.println("- >User dont enter any produt into search field  ");
	}


}
