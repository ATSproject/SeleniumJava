package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Dafabet {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dafabet.com/in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("JOIN NOW")).click();
		
		driver.findElement(By.id("RegistrationForm_username")).sendKeys("7799089921");
		driver.findElement(By.id("RegistrationForm_password")).sendKeys("6302872673");
		

		WebElement elem= driver.findElement(By.id("RegistrationForm_currency"));
		Select s = new Select(elem);
		
		s.selectByVisibleText("EUR");
		elem.click();
		
		WebElement elem1 = driver.findElement(By.id("RegistrationForm_country"));
		Select s1 = new Select(elem1);
		s1.selectByVisibleText("Thailand");
		elem1.click();
		

	}

}
