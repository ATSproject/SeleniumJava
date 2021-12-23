package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exception_Handling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/disabled.html");
		
		try{
			enterValue(driver.findElement(By.id("andja")),"ajaykumar","FirstName");
			enterValue(driver.findElement(By.id("bhadahb")),"kumarswamy","LastName");
			
			
		}catch(NoSuchElementException e) {
			System.out.println("element is not found....");
			
		}	finally {   
			   driver.close();
		}
	}
	
	
	public static void enterValue(WebElement elem, String value, String fieldName) {
		if(elem.isDisplayed()) {
			if(elem.isEnabled()) {
				elem.sendKeys("ajaykumar");
				
			}else {
				System.out.println("unable to enter the value as the fiels is disabled..");
			}
		
		}else {
			System.out.println("unable to enter value as the field is invisable in UI..");
		}
	
}

	}
