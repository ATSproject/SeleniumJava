package basics_1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.google.common.annotations.VisibleForTesting;

public class Application_Methods {
	  
	private WebDriver driver;
	
	public Application_Methods(WebDriver webDriver) {
		
		driver=webDriver;
		
	}
	
	public void navigaToUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.id("txtUsername"));
			System.out.println("navigate the url is successfully");
			
		}catch(NoSuchElementException nse) {
			System.out.println("navigate url is failed");
				
		}	
		
	}

	public void login(String userName,String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	
		try {
			driver.findElement(By.id("welcome"));
			System.out.println("successfully login the page");
			
		}catch(NoSuchElementException nse) {
			System.out.println("failed to login page");
			
		}
		
	}
	
	public void logout() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Logout")).click();
		try {
			driver.findElement(By.id("txtUsername"));
			driver.findElement(By.id("txtPassword"));
			driver.findElement(By.id("btnLogin")).click();
			System.out.println("logout is complete");
			
		}catch(NoSuchElementException nse) {
			System.out.println("logout is failed");
			
		}
		
		
	}

}
