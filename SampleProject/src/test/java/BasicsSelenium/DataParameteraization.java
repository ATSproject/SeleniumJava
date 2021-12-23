package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataParameteraization {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//HashMap<String, String> data = getPropertyData("D:\\SeleniumJava\\SampleProject\\src\\test\\resources\\config\\AppConfig.properties");
		
		////launchApplication(data.get("browser"),data.get("url"));
	}
	
//	public static void launchApplication(String browser, String url) {
//	
//		switch (browser.toLowerCase()) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver= new ChromeDriver();
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//
//		default:
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//			break;
//		}
//		
//		driver.get(url);
//	}	
//		public static HashMap<String, String> getPropertyData(String propertyfile){
//			
//			HashMap<String, String> propertyData = new HashMap<>();
//			try {
//				InputStream filepath = new FileInputStream(propertyfile);
//				Properties props = new Properties();
//				
//				props.load(filepath);
//				
//			Set<Object> allKeys =props.keySet();
//			
//			           for (Object key : allKeys) {
//			        	   
//			        	 String keyName =  key.toString();
//			        	 String keyValue = props.getProperty(keyName);
//			        	 
//			        	 propertyData.put(keyName, keyValue);		
//					}	
//				
//			}catch (IOException e) {
//				System.out.println("failed to load the file");
//			}
//			
//			return propertyData;
//		}	

	}


