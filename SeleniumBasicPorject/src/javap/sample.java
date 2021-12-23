package javap;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();

WebDriver driver =new ChromeDriver();

driver.get("https://www.google.com/");
		
		
		
	}

}
