package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithID {

	public static void main(String[] args) {
		// TO launch the browser
		
	   ChromeDriver driver = new ChromeDriver();
	    // to maximize the window
	   driver.manage().window().maximize();
	   //to launch the application
	   driver.get("https://www.facebook.com/");
	
	   // find the emailtextfield by using ID locator
	   
	   
	   
	WebElement emailTextfield  = driver.findElement(By.id("email"));
	 
	emailTextfield.sendKeys("priyanka");

	}

}
