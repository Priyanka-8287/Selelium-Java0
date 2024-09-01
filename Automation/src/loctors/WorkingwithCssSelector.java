package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		ChromeDriver driver =new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to launch the application
		
	driver.get("https://www.facebook.com");
	//to click on fb by using cssSelector
	
	driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("Piku");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("2345");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
