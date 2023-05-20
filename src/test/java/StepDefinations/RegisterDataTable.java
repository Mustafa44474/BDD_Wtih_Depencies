package StepDefinations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class RegisterDataTable {
	@When("User enter following details into the fields")
	public void user_enter_following_details_into_the_fields(DataTable RegistrationTable) {
		Map<String, String> asMap = RegistrationTable.asMap(String.class, String.class);
		System.out.println(" FirstName: -> "+asMap.get("FirstName"));
		System.out.println(" LastName: -> "+ asMap.get("LastName"));
		System.out.println(" emailaddress: ->"+ asMap.get("emailaddress"));
		System.out.println("telephon: ->"+ asMap.get("telephon"));
		System.out.println("password: -> "+ asMap.get("password"));
		
	}	
	

	@When("Selects privacy policy field")
	public void selects_privacy_policy_field() {
	     System.out.println("Selects privacy policy field");
	}

	@When("clicks on Continue button")
	public void clicks_on_continue_button() {
	     
		  System.out.println("clicks on Continue button");
	}

	@Then("Accound should get succesfully created")
	public void accound_should_get_succesfully_created() {
		  System.out.println("Accound should get succesfully created");
	}


}
