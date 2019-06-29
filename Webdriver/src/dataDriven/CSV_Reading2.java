package dataDriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSV_Reading2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\testdata.txt");
		
		FileReader read = new FileReader(file);
		BufferedReader br =new BufferedReader(read);
		String data;
		data = br.readLine();
		
		while(data!=null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
	}
}
