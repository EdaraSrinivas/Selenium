package pack1;

public class Inher2 extends Inher1 {

	public static void main(String[] args) {
		
		Inher2 obj = new Inher2();
		
		obj.a = 45;
		Inher1.str = "sri";
		
		obj.m1();
		obj.m4();
		
		Inher1.m2();
		
	}
	
	public void m4() {
		System.out.println("m4");
	}

}
