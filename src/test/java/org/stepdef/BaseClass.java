package org.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	
	public static void browserLaunch(String url) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Cucumber8PM\\driver\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
}
