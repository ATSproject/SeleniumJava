package BasicsSelenium;

import org.openqa.selenium.By;

public class TEST extends WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		driver.findElement(By.id("amazon"));
		window("amazon", "file:///E:/HTMLFiles/Test.html");
		
	}

}
