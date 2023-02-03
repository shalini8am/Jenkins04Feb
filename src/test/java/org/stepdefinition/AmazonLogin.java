package org.stepdefinition;
import java.util.List;
import java.util.Map;

import org.pojoclass.AmazonLoginPOJO;
import org.reusablecodes.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AmazonLogin extends BaseClass {

	AmazonLoginPOJO a;
	
	@Given("To launch the chrome browser and max the window")
	public void to_launch_the_chrome_browser_and_max_the_window() {
	    
		browserLaunch();
		pageMax();
	}

	@When("To launch the amz url")
	public void to_launch_the_amz_url() {
	   
		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D60456322738%26hvpone%3D%26hvptwo%3D%26hvadid%3D486459496700%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D14611810923674093056%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007809%26hvtargid%3Dkwd-360364908477%26hydadcr%3D14451_2154369%26gclid%3DCjwKCAiA2rOeBhAsEiwA2Pl7Q0HJkEZryQhyObfMWrLVUzyVz9r5COzX8hVE-yDs4tn0w2pkRFZKTBoCw1MQAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("To pass the invalid username or phno in email field")
	public void to_pass_the_invalid_username_or_phno_in_email_field(DataTable d) {
	   
	 // One dimentional map
	    a = new AmazonLoginPOJO();
	    Map<String, String> m = d.asMap(String.class, String.class);
		txtBox(a.getEmailTxt(),m.get("emailtwo"));
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
	   
		 a = new AmazonLoginPOJO();
		 btnLogin(a.getContinueBtn());
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field(DataTable d) {
	    
		// Two dimentional map
		 a = new AmazonLoginPOJO();
		 List<Map<String, String>> l = d.asMaps();
		 txtBox(a.getPassTxt(), l.get(1).get("passwordtwo"));
	}

	@When("to click the signin button")
	public void toClickTheSigninButton() {
	  
		a = new AmazonLoginPOJO();
		btnLogin(a.getSignInBtn());
	}
	
	@Then("To close the chrome browser")
	public void toCloseTheChromeBrowser() {
	   
		closeBrowser();
	}
	



}
