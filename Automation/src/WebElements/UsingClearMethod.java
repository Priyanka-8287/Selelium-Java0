package WebElements;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        
        WebElement SearchTextField = driver.findElement(By.id("small-searchterms"));

        SearchTextField.sendKeys("Books");
        
        Thread.sleep(2000);
        SearchTextField.clear();
        Thread.sleep(2000);
        SearchTextField.sendKeys("Computer");
	}

}
