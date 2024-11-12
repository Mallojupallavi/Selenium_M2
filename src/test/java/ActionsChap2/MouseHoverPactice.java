package ActionsChap2;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPactice {
	public static void main(String[]args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement homeAndLivindTab = driver.findElement(By.xpath("//a[text()='Home & Living' and @class='desktop-main']"));	
	Actions action = new Actions(driver);
	action.moveToElement(homeAndLivindTab).perform();
	
	driver.findElement(By.xpath("//a[text()='Clocks']")).click();
	String header=driver.findElement(By.cssSelector("h1.title-title")).getText();
	if(header.equalsIgnoreCase("clocks"))
	     System.out.println("Pass");
	else
		System.out.println("Fail");
	driver.quit();
	
}}
