package org.jvm.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	public static void createJvmReport(String jsonFilePath) {
	
	 // 1.Mention the target folder location - File
		File f = new File("C:\\Users\\kumar\\eclipse-workspace\\Cucumber6Pm\\JvmReport");
		
	// 2.Add details to the report using Configuration class
		Configuration c = new Configuration(f, "Facebook & Amazon");
		c.addClassifications("Platform Name", "Windows");
		c.addClassifications("Platform Version", "11");
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "98.0");
		c.addClassifications("Sprint No", "3");
		
     // 3.Add json file paths into List<String>
     
		List<String> l = new ArrayList<String>();
		l.add(jsonFilePath);
		
	 // 4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l, c);
	
	// using the created object call generateReports() method.
		r.generateReports();
		
		
		
		
		
		
		
		
		
		
		
	}

}
