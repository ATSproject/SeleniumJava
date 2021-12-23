package basics_1;

import org.openqa.selenium.WebElement;

public class EventMethods {
	
  public void enterValue(WebElement elem, String value, String fieldName) {
	  
	  if(!elem.isDisplayed()) {
		  if(!elem.isEnabled()) {
			  elem.sendKeys(value);
			  
		  }else {
			  System.out.println("unable to enter into the value: "+fieldName+" as the field is disabled");
		  }
		  
	  }else {
		  System.out.println("unable to enter into the value: "+fieldName+ "as the field is not visible ");
	  }  
  }
  
  public void selectCheckBox(WebElement element, String fieldName) {  
	  if(element.isDisplayed()) {
		  if(element.isEnabled()) {
			  if(!element.isSelected())
				  element.click();
			  
		  }else {
			  System.out.println("unable to select the check box " +"fieldName"+ "as the check box is disabeld");
		  }
		  
	  }else {
		  System.out.println("uanable to select the check box" +"fieldName"+ "as check box is Not visible");
	  }
	  
  }
}
