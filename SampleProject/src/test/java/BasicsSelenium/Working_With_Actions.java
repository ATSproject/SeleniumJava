package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Actions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		
		Actions act = new Actions(driver);
		act.click(pim).perform();
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		WebElement id= driver.findElement(By.id("employeeId"));
		act.sendKeys(id, Keys.HOME).perform();
		
		act.keyDown(Keys.SHIFT).sendKeys(Keys.END).keyUp(Keys.SHIFT).perform();
		

		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		driver.findElement(By.id("lastName")).click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		driver.switchTo().defaultContent();
		WebElement leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
		act.click(leave).perform();
		
		WebElement Entitlements =driver.findElement(By.id("menu_leave_Entitlements"));
		act.click(Entitlements).perform();
		driver.switchTo().defaultContent();
		
		WebElement buzz=driver.findElement(By.id("menu_buzz_viewBuzz"));
		act.doubleClick(buzz).perform();
		
		
		

	}

}
