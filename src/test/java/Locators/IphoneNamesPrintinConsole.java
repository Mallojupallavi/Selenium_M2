package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneNamesPrintinConsole {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone ");
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(3000);
		List<WebElement> iphoneList = driver.findElements(By.className("KzDlHZ"));
		for (WebElement iphone:iphoneList) {
			System.out.println(iphone.getText());
		}
		Thread.sleep(3000);
		driver.quit();
		
}

	
	}
