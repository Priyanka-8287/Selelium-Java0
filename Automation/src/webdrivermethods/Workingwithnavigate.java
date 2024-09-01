package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithnavigate {

	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to launch application
		driver.get("https://www.zomato.com/ncr");
		Thread.sleep(2000);
		
	    driver.navigate().to("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();

	}

}
