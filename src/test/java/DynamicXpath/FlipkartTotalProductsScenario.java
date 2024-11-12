package DynamicXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTotalProductsScenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
       driver.findElement(By.name("q")).sendKeys("iphone");
       driver.findElement(By.className("_2iLD__")).click();
       
       int sum=0;
       for(;;) {
    	   Thread.sleep(2000);
    	   List<WebElement>list=driver.findElements(By.className("KzDlHZ"));
    	   sum=sum+list.size();
    	   try {
    		   
    		   driver.findElement(By.xpath("//span[text()='Next']")).click();  
    	   }  catch(Exception e) {
    		   break;
    	   }
       }
   String header= driver.findElement(By.className("BUOuZu")).getText();  
      String[] str=header.split(" ");
      int actualNumber = Integer.parseInt(str[5]);
     
      if(sum == actualNumber)
    	  System.out.print("Number of product Matched");
      else
    	  System.out.print("not matched");
      driver.quit();
	}

}