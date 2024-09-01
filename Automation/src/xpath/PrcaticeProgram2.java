package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrcaticeProgram2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("HP Laptop",Keys.ENTER);

		List<WebElement> pName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		for (int i=0,i <pName)
	}
	
	

}
