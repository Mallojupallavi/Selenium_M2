package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitVisibility {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement logo=driver.findElement(By.cssSelector("svg.VXJlj"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(logo));
        
        WebElement poori=driver.findElement(By.xpath("//img[@alt='restaurant curated for poori']"));
        wait.until(ExpectedConditions.visibilityOf(poori)).click();
     

}
}