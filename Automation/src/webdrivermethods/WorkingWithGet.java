package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGet {

	public static void main(String[] args) {
		
	//to launch the browser	
		
	WebDriver driver=new ChromeDriver();
	//to launch the application
	
	driver.get("https://www.flipkart.com/");

	}

}
