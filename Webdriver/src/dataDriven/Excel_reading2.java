package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reading2 {
	
	public static void main(String[] args) throws IOException {
		
		File filepath = new File("C:\\Users\\Srinivas\\Desktop\\Gmaildata.xlsx");
		
		FileInputStream fi = new FileInputStream(filepath);
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("login");
		
		int totalrows = sheet.getLastRowNum();
		
		for(int i=1;i<=totalrows;i++) {
			int columns = sheet.getRow(i).getLastCellNum();
			
			for(int j=0;j<columns;j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+",");
			}
			System.out.println("\n");
		}
		
		book.close();

	}

}
