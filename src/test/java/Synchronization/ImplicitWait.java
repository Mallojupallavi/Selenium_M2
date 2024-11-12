package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.swiggy.com/");
        List<WebElement>topRestaurant=driver.findElements(By.xpath("//h2[text()='Top restaurant chains in Hyderabad']/ancestor::div[@class='sc-fzQBhs jExwBk']/descendant::div[@class='sc-aXZVg kVQudY']"));
        for(WebElement restaurant : topRestaurant) {
        	System.out.println(restaurant.getText());
        
        }
        driver.quit();
        
	}       
}
