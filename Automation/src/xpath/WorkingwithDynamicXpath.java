package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithDynamicXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Tops",Keys.ENTER);
		
		List<WebElement> allproductDetails = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		
		
		for(int i=0;i<allproductDetails.size();i++)
		{
		
			System.out.println(allproductDetails.get(i).getText());
		System.out.println("==================");

	}

	}
}