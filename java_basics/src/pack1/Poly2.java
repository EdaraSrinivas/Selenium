package pack1;

public class Poly2 {

	public static void main(String[] args) {
		
		Poly2 obj = new Poly2();

	}
	
	public Poly2() {
		System.out.println("Constructor");
	}
	
	// Overridden
	public void add() {
		int a = 98;
		int b = 23;
		int c = a+b;
	}
	
	public void add(int a,int b) {
		
	}

	protected void add(int a) {
		
	}

}
