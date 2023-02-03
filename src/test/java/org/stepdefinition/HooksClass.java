package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.reusablecodes.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	
	@Before(order = 9) // @Before - incremental order
	public void preCondition1() {		
		
		pageMax();
		System.out.println("Window Maximize");
	}
	
	@Before(order = 4)
	public void preCondition2() {
		
		browserLaunch();
		System.out.println("Browser will launch");
	}	
	   // each scenario it will execute which is presented in all feature file
	
	@After(order = 7) 
	public void postCondition2(Scenario s) {
		
		if (s.isFailed()) {  // returns true when scenario is getting failed
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] sc = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(sc, "image/png");
			System.out.println("Failed Scenario Name :"+ s.getName());		
		}
	}
	
	@After(order = 3)
	public void postCondition1() {
		
		System.out.println("Browser will close");
		closeBrowser();
	}
}
