package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticprogromDynamicxpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("HP Laptop",Keys.ENTER);
		
		List<WebElement> allHPlaptops = driver.findElements(By.xpath("//div[@class='yKfJKb row']"));

		for (int i=0;i<allHPlaptops.size();i++)
			
		{
			System.out.println(allHPlaptops.get(i).getText());
			System.out.println("================");
		}
			
	}

}
