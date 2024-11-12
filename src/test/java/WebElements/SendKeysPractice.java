package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;					
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysPractice {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("hfuidyfhdf"+ Keys.TAB+ "bdjbkdjfhjdkhd" +Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
