package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_PropertiesFile {
	static WebDriver driver;

	public static void main(String[] args) {
		
		HashMap<String, String> data = getPropertyData("D:\\SeleniumJava\\SampleProject\\src\\test\\resources\\config\\AppConfig.properties");
		
		launchApplication(data.get("browser"), data.get("url"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaykumar@7799");
	}
	
	public static void launchApplication(String browser, String url) {
		
		switch (browser.toLowerCase()) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		default:
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		}
		driver.get(url);
		
	}
	
	public static HashMap<String, String> getPropertyData(String propertyfile){
		
		HashMap<String, String> propsData = new HashMap<>();
		try {
			InputStream filepath = new FileInputStream("D:\\SeleniumJava\\SampleProject\\src\\test\\resources\\config\\AppConfig.properties");
			
			
			Properties props = new Properties();
			
			props.load(filepath);
			
			 			
			Set<Object> allKeys	=props.keySet();
			for(Object key: allKeys) {
				
				String keyName	=	key.toString();
									
				String keyValue =props.getProperty(keyName);
				propsData.put(keyName, keyValue);
			}
			
		}catch(IOException e) {
			System.out.println("Failed to load the file from properties file..");
			
		}
							
								
		
		
		return propsData;
	}

}
