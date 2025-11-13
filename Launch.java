package soot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException
	{
		// Step 1: Launch chrome browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Step 2: hit the website url
		driver.get("https://live.astroindusoot.com/login");
		
		Thread.sleep(3000);
		// Clear email input box and enter email
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gautamarora269@gmail.com");
		Thread.sleep(3000);
		// Clear password input box and enter password
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@4077");
		
		Thread.sleep(3000);
		// Click on sign in button
		driver.findElement(By.xpath("//button[@type='submit'][text()='Sign in']")).click();
		
		driver.quit();
	
	}
	
//
}
