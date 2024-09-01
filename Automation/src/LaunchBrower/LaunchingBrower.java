package LaunchBrower;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrower {
	
	static WebDriver driver;

	public static void main(String[] args)
	{
	
		
		Scanner s =new Scanner(System.in);
		System.out.println("=== Entername");
		String browser =s.next();
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
		 driver =new ChromeDriver();
	}
	    else if(browser.equalsIgnoreCase("firefox"))
	{
		 driver = new FirefoxDriver();
		
	}
		else if(browser.equalsIgnoreCase("edge"))
		{ 
			driver = new EdgeDriver();
		}
		else 
		{
	
		System.out.println("Invalid browser");
			
		}
}

}


