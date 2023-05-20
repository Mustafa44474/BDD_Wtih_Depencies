package StepDefinations;

import io.cucumber.java.en.*;

public class RegisterSteps {
	@Given("User navigate to Register Account page")
	public void user_navigate_to_register_account_page() {
		System.out.println("-> User is on Register page");

	}

	@When("User enter firstName {string} into the FirstName field")
	public void user_enter_first_name_into_the_first_name_field(String firstName) {
		System.out.println("-> User enter firstName" + firstName);
	}

	@When("User enter lastName {string} into the lastName field")
	public void user_enter_last_name_into_the_last_name_field(String lastName) {
		System.out.println("-> User enter lastName" + lastName);
	}

	@When("User enter email {string} into email field")
	public void user_enter_email_into_email_field(String email) {
		System.out.println("-> User enter email" + email);
	}

	@When("User enter telephone {string} into Telephone field")
	public void user_enter_telephone_into_telephone_field(String telePhone) {
		System.out.println("-> User enter telePhone" + telePhone);
	}

	@When("User enter password {string} into password field")
	public void user_enter_password_into_password_field(String password) {
		System.out.println("-> User enter password" + password);
	}

	@When("User enter passwrod {string} into password confirm field")
	public void user_enter_passwrod_into_password_confirm_field(String confrimPasword) {
		System.out.println("-> User enter confrimPasword" + confrimPasword);
	}

	@When("User Select privacy policy field")
	public void user_select_privacy_policy_field() {
		System.out.println("-> User select privacy Policy");
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		System.out.println("-> User Clicks on continue button");
	}

	@Then("Account should get succesfully created")
	public void account_should_get_succesfully_created() {
		System.out.println("-> Account should get succesfully created");
	}

	@When("User Select yes for Newsletter")
	public void user_select_yes_for_newsletter() {
		System.out.println("-> User select Newsletter");
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {
		System.out.println("-> User dont enter details into any fields");
	}

	@Then("Warning messages should be displayed for the mandatory fields")
	public void warning_messages_should_be_displayed_for_the_mandatory_fields() {
		System.out.println("-> Warning messages should display");
	}

	@When("User enter priviuse email {string} into email field")
	public void user_enter_priviuse_email_into_email_field(String string) {
		System.out.println("-> User enter priviuse emai");
	}

	@Then("Warning message informting the user about dublipate")
	public void warning_message_informting_the_user_about_dublipate() {
		System.out.println("-> Warning message informting the user about dublipate ");
	}

}
