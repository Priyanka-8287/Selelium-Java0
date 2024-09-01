package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLinktext {

	public static void main(String[] args) {
		
		//to launch the browser
		ChromeDriver driver =new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch the application
		
		driver.get("https://www.facebook.com/");
		
		//click on link with of link text
		
		driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
