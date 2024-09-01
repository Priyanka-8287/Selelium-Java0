package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithClassLocators {

	public static void main(String[] args) {
		
		// to launch the browser
		
				ChromeDriver driver =new ChromeDriver();
				
				//to maximize the window
				
				driver.manage().window().minimize();
				
				//to launch the application
				
				driver.get("https://www.facebook.com/");
				
				//TO fill EMAILTEXTFIELD by using ID locator
				
			 WebElement  emailTextfield =driver.findElement(By.id("email"));
				
				//to fill password by using name locator
				
			 driver.findElement(By.name("pass")).sendKeys("PIKU123");
			 
			 //to click on login button by using classname locator
			 
			 driver.findElement(By.className("_6lth")).click();

				
				


	}

}
