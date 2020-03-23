package excelfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updatedataintofile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	FileInputStream fis=new FileInputStream("C:\\Users\\14388\\Desktop\\my folder\\storefile.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		              XSSFSheet sheet=wb.getSheet("Test1");
		                  XSSFRow row=sheet.createRow(0);
		                  XSSFCell cell=row.createCell(0);
		                  cell.setCellValue("datar");
	FileOutputStream fos=new FileOutputStream("C:\\Users\\14388\\Desktop\\my folder\\storefile.xlsx");
	wb.write(fos);
	wb.close();
		                  
		              
	}

}
