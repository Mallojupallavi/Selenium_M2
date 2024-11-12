package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class IdAndNmaeLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement usernameTF = driver.findElement(By.id("email"));
		usernameTF.sendKeys("dfklhhuhdbfkdjhfkdhf");
		
		WebElement PasswordTF = driver.findElement(By.id("pass"));
		usernameTF.sendKeys("dhfhiudhfdkjf");
		
		WebElement LoginBTN = driver.findElement(By.name("login"));
			LoginBTN.click();
			
			Thread.sleep(3000);
			driver.quit();
		
		
		
		
		
	}

}
