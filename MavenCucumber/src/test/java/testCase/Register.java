package testCase;
import io.cucumber.java.en.*;

public class Register 
{

	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() 
	{
	  System.out.println("---> user has navigated to register account page");  
	}

	@When("User enters first name {string} Into the First Name field")
	public void user_enters_first_name_into_the_first_name_field(String firstName)
	{
	    System.out.println("---> user entered first name" + firstName);
	}

	@When("Enters lastname {string} into the Last Name field")
	public void enters_lastname_into_the_last_name_field(String lastName) 
	{
	    System.out.println("---> user entered first name" + lastName);
	}

	@When("Enters email address {string} into the Email field")
	public void enters_email_address_into_the_email_field(String emailId)
	{
	    System.out.println("---> user entered email" + emailId);
	}

	@When("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_Telephone_field(String phoneNum)
	{
		System.out.println("---> user entered telephone number" + phoneNum);
	}

	@When("Enters password {string} into the Password field")
	public void enters_password_into_the_password_field(String pass) 
	{
		System.out.println("---> user entered password" + pass);
	}

	@When("Enters password {string} into the Password Confirm field")
	public void enters_password_into_the_password_confirm_field(String confPass) 
	{
		System.out.println("---> user confirmed password" + confPass);
	}

	@When("Selects Privacy Policy field")
	public void selects_privacy_policy_field()
	{
		System.out.println("---> user checked privacy policy field");
	}

	@When("Click on Continue button")
	public void click_on_continue_button() 
	{
		System.out.println("---> user clicked on continue button"); 
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() 
	{
		System.out.println("---> Account created successfully");
	}

	@When("Selects Yes for Newsletter")
	public void selects_yes_for_newsletter() 
	{
		System.out.println("---> Selected yes for Newsletter");
	}

	@When("Clicks on Continue button")
	public void clicks_on_continue_button() 
	{
		System.out.println("---> clicked continue button");
	}

	@When("User don’t enter details into any fields")
	public void user_don_t_enter_details_into_any_fields() 
	{
		System.out.println("---> user has not entered details into any fields");
	}

	@Then("Warning messages should be displayed for all the mandatory fields")
	public void warning_messages_should_be_displayed_for_all_the_mandatory_fields()
	{
		System.out.println("---> warning message displayed for all mandatory fields");
	}
	
}
