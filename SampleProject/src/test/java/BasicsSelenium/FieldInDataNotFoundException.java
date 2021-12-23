package BasicsSelenium;

public class FieldInDataNotFoundException extends  Exception{
	private String massage;
	public FieldInDataNotFoundException() {
		
	}
   public FieldInDataNotFoundException(String massage) {
		this.massage = massage;
	}
     public String getMassage() {    
	   
	   
     return massage;
     
   }

}
