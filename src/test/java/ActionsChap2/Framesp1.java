package ActionsChap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesp1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		
		//WebElement frame =driver.findElement(By.name("callout"));
		//driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Stay signed out']"));
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("q")).sendKeys("Automation testing jobs for freshres" + Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
