package WebElements;

import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationSizeRect {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signupbtn=driver.findElement(By.xpath("  //button[normalize-space(text()='Sign up for GitHub']"));
		
		Point location = signupbtn.getLocation();
		System.out.println("X-coordinate :"+location.getX());
		System.out.println("Y-coordinate :"+location.getY());
		
		Dimension size=signupbtn.getSize();
		System.out.println("Height :"+size.getHeight());
		
		System.out.println("Width :"+size.getWidth());
		org.openqa.selenium.Rectangle rect=signupbtn.getRect();
		
		System.out.println("-------from getRect()-------");
		
		System.out.println("X-coordinate :"+rect.getX());
		System.out.println("Y-coordinate :"+rect.getY());
		
		System.out.println("Height :"+rect.getHeight());
		System.out.println("Width :"+rect.getWidth());
	}
}
