package dataDriven;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_Writing {

	public static void main(String[] args) throws IOException {
	
		File file = new File("E:\\data.txt");
		
		FileWriter write = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(write);
		
		bw.write("sri");
		bw.write(3456);
		bw.newLine();
		bw.write("45.1234");	
		
		bw.close();
		

	}

}
