package pack2;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
	//	ArrayList<Double> obj1 = new ArrayList<Double>();
		
		obj.add(23);
		obj.add(12);
		obj.add(56);
		obj.add(34);
		obj.add(90);
		
		obj.add(90);
		
		System.out.println(obj.size()); // 5
		System.out.println(obj.get(4));	// 90
		
		obj.remove(3);
		obj.remove(1);
		
		System.out.println(obj.size());	// 3
		
		
		
		
	}

}
