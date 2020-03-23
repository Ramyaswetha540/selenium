package excelfiles;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatafromxlsheet {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fis=new FileInputStream("C:\\Users\\14388\\Desktop\\my folder\\new file.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
		XSSFSheet sheet=wb.getSheetAt(0);
		//System.out.println(sheet.getLastRowNum());
		//to print no of rows in the sheet
		for(int r=0;r<=sheet.getLastRowNum();r++)
		{
		  XSSFRow row=sheet.getRow(r);
		
		 // System.out.println(row.getLastCellNum());
		for(int c=0;c<=row.getLastCellNum();c++)
		{
		  XSSFCell cell=row.getCell(2);
		  System.out.println(cell.getStringCellValue());
		     
		} 
		}
		
	
	}
}
