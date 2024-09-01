package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithPartiallinktext {

	public static void main(String[] args) {
		// To launch the browser
		
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch the application
		driver.get("https://www.facebook.com/");
//click the link with the help of partial link text
		
		driver.findElement(By.partialLinkText("For")).click();
	}

}
