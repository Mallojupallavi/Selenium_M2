package ActionsChap2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownActions {
public static void main(String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
	Select s = new Select(allDropDown);
	s.selectByIndex(12);
	Thread.sleep(2000);
	s.selectByValue("search-alias=digital-music");
	Thread.sleep(2000);
	s.selectByVisibleText("Computers & Accessories");
	System.out.println("************************");
	if(s.isMultiple())
		System.out.println("Multi Select");
	else
		System.out.println("Single Select");
	System.out.println("************************");
	List<WebElement> list = s.getOptions();
	for(WebElement e : list) {
		System.out.println(e.getText());
		
	}driver.quit();
}
}
