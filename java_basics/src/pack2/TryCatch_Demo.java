package pack2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch_Demo {

	public static void main(String[] args) throws IOException {
		
		readData("D://data.txt");
	}
	
	public static void readData(String filename) throws IOException {
		
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		br.close();
		
	}
}