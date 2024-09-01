package loctors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatopractice {

	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch the browser
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
	   WebElement search= driver.findElement(By.cssSelector("input [placeholder='Search for restaurant, cuisine or a dish']"));
	   search.sendKeys("roti");
	   Thread.sleep(2000);
	   search.click();
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector(""));
	   
	   

	}

}
