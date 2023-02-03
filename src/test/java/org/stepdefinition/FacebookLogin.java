package org.stepdefinition;

import org.junit.Assert;
import org.pojoclass.LoginPOJO;
import org.reusablecodes.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass {
	
	LoginPOJO l;

	@Given("To launch the browser and max window")
	public void to_launch_the_browser_and_max_window() {
		
	    browserLaunch();
	    pageMax();
	}

	@When("To launch the url of the application")
	public void toLaunchTheUrlOfTheApplication() {
		launchUrl("https://www.facebook.com/");
	    
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
		
	    l = new LoginPOJO();
	    txtBox(l.getEmailTxt(), "abc@gmail.com");
	    Assert.assertTrue(false);
	}

	@When("To pass the valid password in password field")
	public void to_pass_the_valid_password_in_password_field() {
		
		 l = new LoginPOJO();
		 txtBox(l.getPassTxt(), "125683");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	    
		 l = new LoginPOJO();
		 btnLogin(l.getLoginFindAll());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeBrowser();
	}
	
}
