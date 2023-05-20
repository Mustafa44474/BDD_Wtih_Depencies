package StepDefinations;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("User is navigate to Login page")
	public void user_is_navigate_to_login_page() {
		System.out.println(" -> User got naviagted to login page");
	}
 
	@When("User enters valid email address gmustafa.siddiqi1@gmail.com")
	public void user_enters_valid_email_address_gmustafa_siddiqi1_gmail_com() {
	   
	}

	@When("User enters valid password Automation@{int}")
	public void user_enters_valid_password_automation(Integer int1) {
	    
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address_gmustafa_siddiqi2_gmail_com(String email) {
	  
	}

	@When("User enters valid email address gmustafa.siddiqi3@gmail.com")
	public void user_enters_valid_email_address_gmustafa_siddiqi3_gmail_com() {
	    
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		System.out.println("-> User clicks on Login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println("-> User should logined successfully");
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
		System.out.println(" -> Users Enters invalid email address" + invalidEmail);
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String invalidvalidPassrod) {
		System.out.println("-> User etners valid password" + invalidvalidPassrod);
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println("-> User should got proper warning message");
	}

	@When("User dont enters any credentials")
	public void user_dont_enters_any_credentials() {
		System.out.println("-> User has not enters any credentials ");
	}

}
