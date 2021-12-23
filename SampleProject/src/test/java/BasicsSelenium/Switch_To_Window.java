package BasicsSelenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_Window {
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/HTMLFiles/index.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks) {
			link.click();
			
		}
	
		
	   String mainPageHandle=	driver.getWindowHandle();
		Set<String> allHandles=driver.getWindowHandles();
		String windowToSwitch ="Outlook";
		boolean isWindowFound=false;
		for(String Handle:allHandles) {
			driver.switchTo().window(Handle);
			if(driver.getTitle().contains(windowToSwitch)) {
				isWindowFound=true;
				break;
				
			}
			}
		if(isWindowFound) {
			System.out.println("successfully switch to window:"+windowToSwitch);
			
		}else {
			System.out.println("unable to switch to window:"+windowToSwitch+"as window is not found");
		}
		
		System.out.println(driver.getTitle());
			
		}
	
	
	}


