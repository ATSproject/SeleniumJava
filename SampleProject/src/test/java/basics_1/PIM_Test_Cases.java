package basics_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PIM_Test_Cases {
	

	

	public static void main(String[] args) throws InterruptedException {
		tc1();
		
	}
	
	public static void tc1() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		String url="https://opensource-demo.orangehrmlive.com/";
	
		String userName= "Admin";
		String password ="admin123";
		String firstName = "ajay";
		String middleName ="";
		String lastName = "kumar";
		String empId ="12345254";
	    String userName2 ="test";
		String password2="test457";
		String confirm_Password="test457";
		String status="disabled";
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Application_Methods appMethods = new Application_Methods(driver);
		PIM_Methods pimMethod = new PIM_Methods(driver);
		
		
		appMethods.navigaToUrl(url);
		appMethods.login(userName, password);
		
		pimMethod.navigateToAddEmployeePage();
		pimMethod.enterEmployeBasicDetails(firstName, middleName, lastName, empId);
		pimMethod.createLoginDetails(userName, password, password2 );
		
		 appMethods.logout();
		
		
	}
	

}
