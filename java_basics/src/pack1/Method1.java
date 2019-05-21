package pack1;

public class Method1 {

	int r;
	static int t;
	
	public static void main(String[] args) {
		
		Method1 obj = new Method1();
		obj.m1();
		obj.m2();
		
		m2();
	}
	
	public void m1() {
		
		int a = 67;	// local variable
	//	static int b; // invalid
		
		final int C = 56;
		r =74;
		t = 78;
		System.out.println("m1");
	}
	
	public static void m2() {
		System.out.println("M2");
		
		int a1;
		int a2;
		final int a3;
	//	r = 76;
		t = 34;
		
	}
	
	public void m3() {
		System.out.println("m3");
	}
	
	
	public final void add() {
		System.out.println("add");
	}
	
	public void addition(){
			
		int a = 87;
		int b = 56;	
	}
}
