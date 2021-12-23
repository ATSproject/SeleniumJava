import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private static WebDriver driver;
	privare static String mainwindowhandle;
	
	public void launchApplication(String browser,String url) {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "firfox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		default:
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
	}
	
	
	public void  closeCurrentWindow() {
		try {
			driver.close();
		}catch(WebDriverException e){
			System.out.println("current window is already closed..");
		}
	}
	
	public static void webDriver get() {
		
	}
	
	
	 public void switchToMainWindow() {
		 driver.switchTo().window(mainwindowhandle);
	 }
	 
	 
	 public void closeCurrentWin_switchToMian() {
		closeCurrentWindow();
		 switchToMainWindow();
	 }
	 
	 public static void quitDriver() {
		 try {
			 driver.quit();
		 }catch(Exception e) {
			 System.out.println("driver is already terminated..");
			 
		 }
	 }
		
}
