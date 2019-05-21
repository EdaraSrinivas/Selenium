package pack1;

public class Abc1 extends Abc {

	public static void main(String[] args) {
		
		Abc1 obj = new Abc1();
		

	}

	/*@Override
	public void m2() {
		System.out.println("In-complete info/abstract");
		
	}*/
	
	public void m1() {
		System.out.println("complete info/concrete method");
	}

	public void m2() {
		System.out.println("In-complete info/abstract");
		
	}
}
