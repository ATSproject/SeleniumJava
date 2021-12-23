package BasicsSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Alert alert=driver.switchTo().alert();
		
	
		String text=alert.getText();
		
		System.out.println(text);
		
		alert.accept();
		//alert.dismiss();
		
		driver.findElement(By.id("datepicker")).sendKeys("12/12/2021");
		
		
		
	}

}
