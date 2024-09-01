package webdrivermethods;

import java.awt.Window;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetCurrentURL {

	public static void main(String[] args) {
		// To launch the browser
		ChromeDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch the application
		driver.get("https://www.flipkart.com/");
		//to fetch the url
		    String actual_url =driver.getCurrentUrl();
		    String expected_url = "https://www.flipkart.com/";
		    if (actual_url.equals(expected_url))
		    System.out.println("url correct");
	         else
	        	 System.out.println("url incorrect");

	}

}
