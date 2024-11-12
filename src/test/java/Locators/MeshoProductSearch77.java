package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeshoProductSearch77 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.meesho.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("sc-eVspGN bwFWAi")).click();
		driver.findElement(By.className("sc-eVspGN bwFWAi")).sendKeys("kurthi");
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
