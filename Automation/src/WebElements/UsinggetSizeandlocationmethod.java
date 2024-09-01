package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsinggetSizeandlocationmethod {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        
      WebElement search = driver.findElement(By.name("q"));
      
      Dimension size = search.getSize();
      
      System.out.println(size);
      
     Point loc = search.getLocation();
     System.out.println(loc);
	}

}
