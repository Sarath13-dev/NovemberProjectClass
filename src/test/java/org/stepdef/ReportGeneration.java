package org.stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {

	
	public static void generateReport(String json) {
		
		//mention folder name for storing reports
		File f = new File("C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Cucumber8PM\\target");
		
		
		//To configure 
		Configuration con = new Configuration(f, "Cucumber8PM");
		
		//to add various fields
		con.addClassifications("Platform", "Windows");
		con.addClassifications("Version", "8.1");
		
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		//Create object for predefined class called as ReportBuilder
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
		
		
		
	}
	
	
}
