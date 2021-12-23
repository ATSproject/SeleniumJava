package BasicsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Switch_To_Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/HTMLFiles/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("firstName")).sendKeys("ajay");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		driver.findElement(By.id("userName")).sendKeys("kumarajay");
		driver.findElement(By.id("passWord")).sendKeys("123456789");
		driver.findElement(By.id("btnLogin")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("facebook")).click();
	}

}
