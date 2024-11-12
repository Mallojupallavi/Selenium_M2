package ActionsChap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElements {
	public static void main(String[]args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement blockbusterdeal = driver.findElement(By.xpath("//div[@class='dcl-container-inner' and contains(.,'Blockbuster Deals | Ends Oct 29')]"));
		int x = blockbusterdeal.getLocation().getX();
		int y = blockbusterdeal.getLocation().getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scroll(" + x +","+ y + ")");
		Thread.sleep(2000);
		driver.quit();
}}
