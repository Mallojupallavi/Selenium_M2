package ActionsChap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup1 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/upload");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sriva\\OneDrive\\Documents\\Resume.docx");

Thread.sleep(2000);
driver.quit();
}
}
