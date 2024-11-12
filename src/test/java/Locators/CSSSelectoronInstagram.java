package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectoronInstagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Abcdef@123");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("abcd#123");	
		driver.findElement(By.cssSelector("button[type=\"sumbit\"])")).click();
		
		Thread.sleep(2000);
		driver.quit();
}
}                                                