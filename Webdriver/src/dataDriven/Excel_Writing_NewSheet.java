package dataDriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Writing_NewSheet {
	
	public static void main(String[] args) throws IOException {
		
		File filepath = new File("C:\\Users\\Srinivas\\Desktop\\write.xlsx");
		
		FileOutputStream fo = new FileOutputStream(filepath);
		
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet("data");
		
		sheet.createRow(2).createCell(2).setCellValue("Hello");
		sheet.createRow(3).createCell(1).setCellValue("Hi");
		sheet.getRow(2).createCell(5).setCellValue(1234567);
		// Saving
		book.write(fo);
		book.close();
		
	}

}
