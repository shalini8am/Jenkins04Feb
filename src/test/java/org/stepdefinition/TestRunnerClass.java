package org.stepdefinition;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources", 
                 glue = "org.stepdefinition" ,
                 monochrome = true , 
                 dryRun = false,
                 strict = true,
                 snippets = SnippetType.CAMELCASE,
                 plugin = {"html:target", "junit:JunitReport\\JunitRep.xml" 
                		   ,"json:JsonReport\\JsonRep.json" ,
                		   "rerun:src\\test\\resources\\failed.txt"})
                 
public class TestRunnerClass {

	@AfterClass
	public static void report() {
		
		Report.createJvmReport("C:\\Users\\kumar\\eclipse-workspace\\Cucumber6Pm\\JsonReport\\JsonRep.json");
	}
	
	
}
