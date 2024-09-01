package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPracticeProgram {

	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 //to find create page by class
	driver.findElement(By.className("_6lti")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("u_3_b_O2")).sendKeys("Piku");
	

	}

}
