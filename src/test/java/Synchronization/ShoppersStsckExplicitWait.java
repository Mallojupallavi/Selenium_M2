package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStsckExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		boolean status = wait.until(ExpectedConditions.titleContains("ShoppersStack"));
		System.out.println(status);
	driver.quit();
		
	}
}
