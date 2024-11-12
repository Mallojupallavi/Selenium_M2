package WebDriverMethod;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetsizeAndSetsizeofWindow {
public static void main (String[]args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	Dimension actDimension=driver.manage().window().getSize();
	System.out.println(actDimension);
	
	Thread.sleep(2000);
	Dimension reqDimention=new Dimension(1300,700);
	  driver.manage().window().setSize(reqDimention);
	  
	  Thread.sleep(2000);
      driver.close();
	
}
}
