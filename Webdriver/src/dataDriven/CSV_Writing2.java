package dataDriven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_Writing2 {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		File file = new File("E:\\data.txt");
		// Read Existing data
		FileReader read = new FileReader(file);
		BufferedReader br =new BufferedReader(read);
		String data;
		data = br.readLine();
		
		while(data!=null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
		
		// Writing the new Data to the existing data file
		FileWriter write = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(write);
		bw.newLine();
		bw.write("Selenium");
		Thread.sleep(5000);
		bw.close();
	}

}
