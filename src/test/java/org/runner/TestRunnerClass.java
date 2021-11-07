package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdef.JVMReport;
import org.stepdef.ReportGeneration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RAM SARATH KUMAR\\"
		+ "eclipse-workspace\\Cucumber8PM\\src\\test\\resources\\FBlogin.feature",
glue="org.stepdef", plugin="json:C:\\\\Users\\\\RAM SARATH KUMAR\\\\eclipse-workspace\\\\Cucumber8PM\\\\target\\\\sam.json")
public class TestRunnerClass {

	@AfterClass
	public static void generateReport() {
		
		ReportGeneration.generateReport("C:\\\\\\\\Users\\\\\\\\RAM SARATH KUMAR\\\\\\\\eclipse-workspace\\\\\\\\Cucumber8PM\\\\\\\\target\\\\\\\\sam.json");
	}
	
}
