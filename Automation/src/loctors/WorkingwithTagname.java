package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTagname {

	public static void main(String[] args) {
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to launch the application
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchTextfield = driver.findElement(By.tagName("input"));
		searchTextfield.sendKeys("BOOKS");

	}

}
