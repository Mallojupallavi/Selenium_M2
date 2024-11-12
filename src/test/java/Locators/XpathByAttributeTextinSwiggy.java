package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeTextinSwiggy {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//img[@alt='restaurants curated for dosa']")).click();
		driver.findElement(By.xpath("//div[text ()='Pure Veg']")).click();
		
		driver.findElement(By.xpath("//div[text ()='Less than 30 mins']")).click();
		
		driver.findElement(By.xpath("//div[text ;;l()='Ambika Tiffin Centre']")).click();
		
		WebElement deliveryCharges= driver.findElement(By.xpath("//div[@class='sc-aXZVg fVWuLc']"));
		System.out.println(deliveryCharges.getText());
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
