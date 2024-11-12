package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsAnable {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBTN = driver.findElement(By.cssSelector("button[type='submit']"));
		if(loginBTN.isEnabled())
			loginBTN.click();
		else
			System.out.println("disabled");
		driver.findElement(By.name("username")).sendKeys("dgjygdsukjbskjd");
		driver.findElement(By.name("password")).sendKeys("cjhviuhdbsnc");
		if(loginBTN.isEnabled())
			loginBTN.click();
		else
			System.out.println("disabled");
		
		driver.quit();
}
}
