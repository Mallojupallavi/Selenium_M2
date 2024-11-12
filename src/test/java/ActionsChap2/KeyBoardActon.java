package ActionsChap2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActon {
	public static void main(String[]args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement SearchTF = driver.findElement(By.name("q"));
		Actions action= new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys(SearchTF, "hai").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//div[@class='pkt1Wd byDyWd N8ZFrc']")).click();
		
		
		driver.quit();
}}
