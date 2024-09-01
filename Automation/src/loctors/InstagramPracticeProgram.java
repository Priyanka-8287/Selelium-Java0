package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramPracticeProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.className("_ap3a _aaco _aacw _aad0 _aad7")).click();


	}

}
