package basics_1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public  class PIM_Methods  extends EventMethods{
	private WebDriver driver;
	
	public PIM_Methods(WebDriver webDriver) {
		
		driver=webDriver;
		
	}
	public void navigateToAddEmployeePage() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		
		try {
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			System.out.println("application is navigate to add employe page");
			
		}catch(NoSuchElementException nse) {
			System.out.println("application is not navigate to add employee page");
		}
		
		try {
			driver.findElement(By.id("employee-information"));
			System.out.println("application is navigate to employe information page");
			
		}catch(NoSuchElementException nse) {
			System.out.println("application is not navigate to employee information page");
			
		}
		
		
			}
	public void enterEmployeBasicDetails(String firstName, String MiddleName, String lastName, String empId) {
		enterValue(driver.findElement(By.id("firstName")), firstName, "FirstName");
		enterValue(driver.findElement(By.id("lastName")), lastName, "LastName");
		enterValue(driver.findElement(By.id("employeeId")), empId, "EmpId");
		driver.findElement(By.id("chkLogin")).click();
		
	}
	public void createLoginDetails(String userName, String password, String password2) {
		
		enterValue(driver.findElement(By.id("user_name")), userName, "userName");
		enterValue(driver.findElement(By.id("user_password")), password, "password");
		enterValue(driver.findElement(By.id("re_password")), password2, "Confirm password");
		WebElement elem1=driver.findElement(By.id("status"));
		Select s2 = new Select(elem1);
		s2.selectByVisibleText("Disabled");
		elem1.sendKeys("Disabled");
		
	}
	
	

}
