package ActionsChap2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiThreadDropDown {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement courses = driver.findElement(By.id("cars"));
		Select s = new Select(courses);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("99");
		Thread.sleep(2000);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )"); //we should remove the space at the end
		System.out.println("************************");
	List<WebElement>list=s.getOptions();
			for(WebElement e : list) {
				System.out.println(e.getText());
			}
			System.out.println("*************************************");
		if(s.isMultiple()) {
			System.out.println("Multi Select");
			System.out.println("First Selected Option:"+s.getFirstSelectedOption().getTagName());
			List<WebElement> selectOptions= s.getAllSelectedOptions();
			for(WebElement opt : selectOptions) {
				System.out.println(opt.getText());
			}
			s.deselectByIndex(0);
			s.deselectByValue("99");
			s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		}
		else
			System.out.println("Single Select");
		driver.quit();
}
}