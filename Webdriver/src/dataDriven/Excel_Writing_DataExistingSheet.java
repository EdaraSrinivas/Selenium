package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Writing_DataExistingSheet {
	
	public static void main(String[] args) throws IOException {
		
		File filepath = new File("C:\\Users\\Srinivas\\Desktop\\write.xlsx");
		
		FileInputStream fi = new FileInputStream(filepath);
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		
		XSSFSheet sheet = book.getSheet("data");
		
		sheet.getRow(2).createCell(0).setCellValue(true);
		sheet.createRow(5).createCell(0).setCellValue(false);
		
		FileOutputStream fo = new FileOutputStream(filepath);
		// Saving
		book.write(fo);
		book.close();
		
	}
}
