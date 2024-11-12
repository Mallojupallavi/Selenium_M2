package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeText {
public static void main(String[]args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("handbags");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Textured Tote bag']")).click();
	
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
	
}
}
