package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithManage {

	public static void main(String[] args) {
		//to launch the browser
		ChromeDriver driver= new ChromeDriver();
		// to maximize the window
		
		driver.manage().window().maximize();
		
		//to launch the application
		
		driver.get("https://www.flipkart.com/");

	}

}
