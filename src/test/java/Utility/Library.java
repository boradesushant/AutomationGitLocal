package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Library {

	public static void main(String[] args) throws IOException {
		
	}
	public static void Excell_String(String SheetName ,String row,String cell) throws IOException {
		
		 String path=System.getProperty("user.dir")+"\\TestData\\Excell_Data.xlsx";
	      
	      FileInputStream file=new FileInputStream(path);
	      
	      XSSFWorkbook wb=new XSSFWorkbook(file);
	      
		String	Data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			
			System.out.println(Data);
	}
	public static Double Excell_Numeric(String SheetName ,int row,int cell) throws IOException {
		
		 String path=System.getProperty("user.dir")+"\\TestData\\Excell_Data.xlsx";
	      
	      FileInputStream file=new FileInputStream(path);
	      
	      XSSFWorkbook wb=new XSSFWorkbook(file);
	      
	      
	      return wb.getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
		
	      
	      
	      
	}


}
