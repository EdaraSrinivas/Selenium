package pack1;

public class Poly3 extends Poly2 {

	public static void main(String[] args) {
		
		Poly3 obj = new Poly3();

	}
	
	public Poly3() {
		
		System.out.println("Child Constructor");
	}
	
	
	// Overriding
	@Override
	public void add() {
		
	}
	
	public void add(int a, int b) {
		int c = a+b;;
		
	}
	
	public void add(int a, String b) {
		
	}
	
	public void add(int a) {
		
	}

	public void add(int a,int b,int c) {
		
	}
}
