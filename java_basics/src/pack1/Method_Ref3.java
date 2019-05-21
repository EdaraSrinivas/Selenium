package pack1;

public class Method_Ref3 {

	public static void main(String[] args) {
	
		Method_Ref3 obj = new Method_Ref3();
		obj.add();
		obj.sub();
		obj.mul();

	}
	
	void add() {
		
		System.err.println("add");
	}
	void sub() {
		System.out.println("sub");
	}

	int mul() {
		int a = 34;
		int b = 34;
		int c = a*b;
		return c;
		
	}
}
