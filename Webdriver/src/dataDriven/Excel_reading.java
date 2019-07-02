package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reading {
	
	public static void main(String[] args) throws IOException {
		
		File filepath = new File("C:\\Users\\Srinivas\\Desktop\\Gmaildata.xlsx");
		
		FileInputStream fi = new FileInputStream(filepath);
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("login");
		
		String data = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		double data1 = sheet.getRow(1).getCell(5).getNumericCellValue();
		System.out.println(data1);
		
		book.close();

	}

}
