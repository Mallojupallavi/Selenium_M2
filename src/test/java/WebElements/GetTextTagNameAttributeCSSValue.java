package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextTagNameAttributeCSSValue {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		System.out.println("Text on the element : "+loginbtn.getText());
		
		System.out.println("Tag name on the element : "+loginbtn.getTagName());
		
		System.out.println("Get attribute : "+loginbtn.getAttribute("data-testid"));
		
		System.out.println("Font : "+loginbtn.getCssValue("Background color"));
		System.out.println("Color : "+loginbtn.getCssValue("color"));
		
		driver.quit();
}
}