package pack1;

public class Method_Ref2 {

	public static void main(String[] args) {

	//	System.out.println("Hi...!");
		
		Method_Ref2 obj = new Method_Ref2();
		obj.addition();
		obj.subtraction();
		int result = obj.mul();
		System.out.println("Mul:"+result);
		
	//	System.out.println(obj.mul());
	}

	public void addition() {
		
		int a = 98;
		int b = 23;
		int result = a + b;
		System.out.println("Addition:"+result);
	}
	
	public void subtraction() {
		
		int a = 98;
		int b = 23;
		int result = a - b;
	//	System.out.println(result);
		System.out.println("Sub:"+result);
	}
	int mul() {
		int a = 34;
		int b = 34;
		int c = a*b;
		return c;
	}
	
}
