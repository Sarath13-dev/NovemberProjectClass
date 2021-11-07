package org.stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmreport(String json) {
		
		File f = new File("C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Cucumber8PM\\target");
		
		
		Configuration con = new Configuration(f, "output");
		
		con.addClassifications("username", "12345");
		con.addClassifications("password", "rtyu");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
		
	}
}
