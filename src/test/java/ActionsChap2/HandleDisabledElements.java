package ActionsChap2;

import java.time.Duration;	

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElements {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement LoginBTN = driver.findElement(By.cssSelector("[type=\"submit\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", LoginBTN);
		
		Thread.sleep(2000);
		LoginBTN.click();
		Thread.sleep(2000);
		driver.quit();
}}
