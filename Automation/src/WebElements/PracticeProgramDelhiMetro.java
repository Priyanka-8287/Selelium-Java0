package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgramDelhiMetro {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://delhimetrorail.com/");
		
         //Thread.sleep(3000);
         
      WebElement PopupText = driver.findElement(By.xpath("//button[@id='buttonDismiss1'][1]"));
    		 
    PopupText.click();
    
         WebElement From = driver.findElement(By.xpath("//input[@id='FromStation']"));
         From.click();
        // Thread.sleep(3000);
          WebElement line1 = driver.findElement(By.xpath("//div[@class='popup-result']"));
          line1.click();
         // Thread.sleep(3000);
         WebElement Station = driver.findElement(By.xpath("//div[@class='sub-result-right']"));
   
         Station.click();
         //Thread.sleep(3000);
         
         
       WebElement StationTo = driver.findElement(By.xpath("//input[@id='ToStation']"));
       
      StationTo.click();
     // Thread.sleep(2000);
      
     WebElement Line3 = driver.findElement(By.xpath("//input[@class='form-select search-popup']"));
     Line3.click();
     //Thread.sleep(2000);
     
    WebElement Station3 = driver.findElement(By.xpath("//div[@class='popup-result-location red']"));
    
    Station3.click();
    //Thread.sleep(2000);
      WebElement Second2 = driver.findElement(By.xpath("//div[@class='sub-result-name']"));
      Second2.click(); 
     // Thread.sleep(2000);
     
      
     WebElement Button = driver.findElement(By.xpath("//button[text()='Show Route & Fare']"));
     Button.click();
     //Thread.sleep(2000);
      
	}
	

	
}
