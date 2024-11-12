package DynamicXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	public static void main(String[]args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    
	    

}
}