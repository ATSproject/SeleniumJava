package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("https://www.bankofbaroda.in/"); 
		
		WebElement elem = driver.findElement(By.id("abcxyz"));
		
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
   jse.executeScript("arguments[0].setAttribute('value','sample');", elem);
	
	//jse.executeScript("arguments[0].setAttribute('style','border:2px solid red')", elem);	
		
	// jse.executeScript("arguments[0].scrollIntoView(true)", elem);
	}

	
}
