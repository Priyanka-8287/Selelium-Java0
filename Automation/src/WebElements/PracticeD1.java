package WebElements;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeD1 {

	public static void main(String[] args) {
		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.makemytrip.com/?srsltid=AfmBOoqbnR-yZSqzZ8YbfItg19nJJ-_H07mTK-Y491Du4TjRYQkK_i_E");
	    
	    driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	    
	    //driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[5]")).click();
	    driver.findElement(By.id("fromCity")).click();
	    
	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Lucknow");
	   // driver.findElement(By.
	    
	
		
		

	}

}
