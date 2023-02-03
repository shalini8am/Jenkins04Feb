package org.stepdefinition;

import org.pojoclass.LoginPOJO;
import org.reusablecodes.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveAndNegativeCase extends BaseClass{

	LoginPOJO l;
	
	@Given("Launch the browser and maximize the window")
	public void launch_the_browser_and_maximize_the_window() {
	    
		 browserLaunch();
		    pageMax();
	}

	@When("Launch the application url in facebook")
	public void launchTheApplicationUrlInFacebook() {
	   
		launchUrl("https://www.facebook.com/");
	}

	@When("pass the positive and negative {string} in email field")
	public void pass_the_positive_and_negative_in_email_field(String a) {
	   
		     l = new LoginPOJO();
		    txtBox(l.getEmailTxt(), a);
	}

	@When("pass the positive and negative {string} in password field")
	public void pass_the_positive_and_negative_in_password_field(String p) {
		
		l = new LoginPOJO();
		 txtBox(l.getPassTxt(), p);
	}

	@When("Click the login button")
	public void click_the_login_button() {	    
		 l = new LoginPOJO();
		 btnLogin(l.getLoginFindAll());
	}

	@Then("Close the browser")
	public void close_the_browser() {
	  		closeBrowser();
	}

}
