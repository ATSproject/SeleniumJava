package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Working_with_Excel {
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	
	public static void main(String[] args) throws IOException {
		InputStream xlfile = new FileInputStream("D:\\SeleniumJava\\SampleProject\\src\\test\\resources\\DataFiles\\EmpManagement.xlsx");
		 wb = new XSSFWorkbook(xlfile);
		 sheet = wb.getSheet("CreateEmp");
		XSSFRow row = sheet.getRow(0);
		if(row !=null) {
			XSSFCell cell = row.getCell(1);
			 String val;
			 if(cell != null) {
				 val=cell.toString();
			 }else {
				 val="";
			 }
			 System.out.println(val);
		}
		
		wb.close();
	}
	public static int getCellByHeader(String cellHeader) throws FieldInDataNotFoundException {
		int cellPos=-1;
		
		XSSFRow headerrow = sheet.getRow(0);
		int totalcols=	headerrow.getLastCellNum();
		for(int i=0; i<=totalcols-1; i++) {
			
			XSSFCell headercell=headerrow.getCell(i);
			if(headercell !=null) {
				String headerval=headercell.toString();
				if(headerval.trim().equalsIgnoreCase(cellHeader.trim())) {
					cellPos=i;
					break;
					
				}
				
			}
			
			
		}
		if(cellPos==-1) {
			throw new FieldInDataNotFoundException("giver col header not found in the data file");
			
		}
		
		
		return cellPos;
		
	}

}
