package xpathbyAxes;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithAnscendant {

	public static void main(String[] args) {
		
		// to launch the browser
		
				ChromeDriver driver =new ChromeDriver();
				
				//to maximize the window
				
				driver.manage().window().minimize();
				
				//to launch the application
				
				driver.get("https://www.facebook.com/");
				
				//Syntax =//tagName[child]/ancestor::tagName[parent]
	}

}
