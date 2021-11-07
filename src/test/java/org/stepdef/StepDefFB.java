package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefFB {

	WebDriver driver;
	
	@Given("User should login to facebook")
	public void user_should_login_to_facebook() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 String title = driver.getTitle();
		 boolean contains = title.contains("Facebook");
		 Assert.assertTrue(contains);
		 System.out.println("user is in facebook page");
		 
	}

	@When("User should enter the {string}and {string}")
	public void user_should_enter_the_and(String string, String string2) {
	
		WebElement txtUsername = driver.findElement(By.id("email"));
		boolean displayed = txtUsername.isDisplayed();
		Assert.assertTrue(displayed);
		txtUsername.sendKeys(string);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(string2);
		
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    WebElement btnlogin = driver.findElement(By.name("login"));
	    boolean enabled = btnlogin.isEnabled();
	    Assert.assertTrue(enabled);
	    System.out.println("login button is enabled to click");
	    btnlogin.click();
	    
	}

	@Then("User Verifies the login page")
	public void user_Verifies_the_login_page() {
	  String title = driver.getTitle();
	  Assert.assertTrue(title.contains("Facebook"));
	  System.out.println("logged in");
	  driver.close();
		
	}



	
	
}
