package webdrivermethods;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithgetpagesource {

	public static void main(String[] args) {
		// to launch browser
		ChromeDriver driver = new ChromeDriver();
		//to maximize the application
		driver.get("https://www.zomato.com/ncr");
			//to launch the application
		driver.getPageSource();
			System.out.println("Zomato");
		//System.out.println(driver.getPageSource());
	}

}
