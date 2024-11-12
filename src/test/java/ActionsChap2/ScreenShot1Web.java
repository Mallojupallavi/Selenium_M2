package ActionsChap2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1Web {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dvm_pds_amz_in_as_s_gm_159_mkw_sRumWK2Nj");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
}}
