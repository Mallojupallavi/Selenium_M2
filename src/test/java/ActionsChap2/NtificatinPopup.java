package ActionsChap2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NtificatinPopup {
public static void main(String[] args) {
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	opt.addArguments("--disable-geolocation");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://in.via.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
