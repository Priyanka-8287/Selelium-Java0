package workingwithSyncronition;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workingwithImpicit {

	private static final Function ExpectedCondition = null;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='FAIR AND HANDSOME']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("122001");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	 
       // wait.until(ExpectedCondition
	}

}
