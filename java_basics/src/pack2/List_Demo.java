package pack2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Demo {

	public static void main(String[] args) {
		
		List<Object> obj = new ArrayList<Object>();
		
		obj.add(23);
		obj.add("sri");
		obj.add(23.12);
		obj.add(false);
		obj.add('e');
		
		obj.add(23.12);
		System.out.println("List:"+obj);
		
		List<String> obj1 = new ArrayList<String>();
		
		
		
		Set<Object> obj2 = new HashSet<Object>();
		obj2.add(34);
		obj2.add("hi");
		obj2.add("hi");
		obj2.add(12);
		obj2.add(12);
		
		System.out.println("Set:"+obj2);
		
	}

}
