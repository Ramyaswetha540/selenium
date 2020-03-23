package excelfiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreDatainxlfile {

	public static void main(String[] args) throws Exception {
		
		
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Test1");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("aadya");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\14388\\Desktop\\my folder\\storefile.xlsx");
		wb.write(fos);
		wb.close();

	}

}
