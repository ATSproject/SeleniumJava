package BasicsSelenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver = new ChromeDriver();
		
       driver.manage().window().maximize();
       
     
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
      
       
       
//       
//       driver.get("file:///E:/HTMLFiles/Test.html");
//     Thread.sleep(3000);
//     List<WebElement>  alllinks = driver.findElements(By.tagName("a"));       
//     for (WebElement links : alllinks) {
//    	   links.click();
//		
//	}
//     
//     String windowHandle =  driver.getWindowHandle();
//       Set<String>  windowHandles =   driver.getWindowHandles();
//       String exphandle = "";
//       boolean iswindowfound = false ;
//     for (String handles : windowHandles) {
//    	 driver.switchTo().window(handles);
//    	 if(driver.getTitle().contains(exphandle)) {
//    		 iswindowfound = true ;
//    		 break ;
//    	 }
//		
//	}
//     if(iswindowfound) {
//    	 System.out.println("expected windowhandle is successfully launched :"+exphandle);
//     }else {
//    	 System.out.println("unable to switch the window:"+exphandle);
//     }
//	  System.out.println(driver.getTitle());
//	  
//	  driver.close();
//	driver.switchTo().window(windowHandle);
//	Thread.sleep(3000);
//	driver.findElement(By.linkText("amazon")).click();
//       
	   
	}
	public  static void window(String exp , String geturl) throws InterruptedException {
		
		

	      driver.get("");
	     Thread.sleep(3000);
	     List<WebElement>  alllinks = driver.findElements(By.tagName("a"));       
	     for (WebElement links : alllinks) {
	    	   links.click();
			
		}
	     
	     String windowHandle =  driver.getWindowHandle();
	       Set<String>  windowHandles =   driver.getWindowHandles();
	       String exphandle = "";
	       boolean iswindowfound = false ;
	     for (String handles : windowHandles) {
	    	 driver.switchTo().window(handles);
	    	 if(driver.getTitle().contains(exphandle)) {
	    		 iswindowfound = true ;
	    		 break ;
	    	 }
			
		}
	     if(iswindowfound) {
	    	 System.out.println("expected windowhandle is successfully launched :"+exphandle);
	     }else {
	    	 System.out.println("unable to switch the window:"+exphandle);
	     }
		  System.out.println(driver.getTitle());
		  
		  driver.close();
		driver.switchTo().window(windowHandle);
		Thread.sleep(3000);
		driver.findElement(By.linkText("amazon")).click();
	       
		
	}

}
