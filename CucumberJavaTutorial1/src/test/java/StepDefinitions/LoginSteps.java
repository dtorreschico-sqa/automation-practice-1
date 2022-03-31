package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step- user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step- user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step- clicks on login button");
	}

	@Then("user is navigted to the homepage")
	public void user_is_navigted_to_the_homepage() {
		System.out.println("Inside Step- user is navigted to the homepage");
	}

//	@When("user enters user1 and pass1")
//	public void user_enters_user1_and_pass1() {
//		System.out.println("Inside Step- user enters user1 and pass1");
//	}
//
//	@When("user enters user2 and pass2")
//	public void user_enters_user2_and_pass2() {
//		System.out.println("Inside Step- user enters user2 and pass2");
//	}
	
}
