package xpathbyAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSpotify {

	public static void main(String[] args) {
		// to launch the browser
		
		ChromeDriver driver =new ChromeDriver();
		
		//to maximize the window
		
		driver.manage().window().minimize();
		
		//to launch the application
		
		driver.get("https://open.spotify.com/");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		//driver.findElement(By.xpath))
		

	}

}

