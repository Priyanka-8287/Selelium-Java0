package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCloseandQuit {

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
		ChromeDriver driver =new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch the application
		driver.get("http://omayo.blogspot.com/");
		//clicking on open a pop-up window
		driver.findElement(By.linkText("Open a popup window")).click();
		//to use close method
		//driver.close();
	Thread.sleep(2000);
		//to use quit
		driver.quit();

	}

}
