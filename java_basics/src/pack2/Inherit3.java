package pack2;

import pack1.Inher1;

public class Inherit3 {

	public static void main(String[] args) {
	
		Inherit3 child = new Inherit3();
		child.m5();
		
		Inher1 parent = new Inher1();
		parent.m1();
	}
	
	public void m5()
	{
		System.out.println("M5");
	}

}
