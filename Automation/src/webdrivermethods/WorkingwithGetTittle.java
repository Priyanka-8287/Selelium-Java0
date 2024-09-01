package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithGetTittle {

	public static void main(String[] args) {
		
		//To launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//To maximize the application
		
		driver.manage().window().maximize();
		//To launch the application
		
		driver.get("https://www.flipkart.com/");
		//to fetch the title
         String actual_title  = driver.getTitle();
         String expected_title  = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

         if (actual_title.equals(expected_title))
        	 System.out.println("Name correct");
         else
        	 System.out.println("Name incorrect");
	}

}
