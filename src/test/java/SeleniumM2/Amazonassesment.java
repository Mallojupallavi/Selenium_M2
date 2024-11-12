package SeleniumM2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonassesment {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.className("hm-icon nav-sprite"
			+ "")).click();
	driver.findElement(By.xpath("//a[@class='hmenu-item'and.='Audible Audiobooks']")).click();
	
	String gfjhgfjgf = driver.findElement(By.xpath("//ul[contains(@class,'hmenu-visible')]/li/a")).getText();
	System.out.println(gfjhgfjgf);
	
	
										}
}
