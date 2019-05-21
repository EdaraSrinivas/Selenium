package pack2;

public class Loops3 {

	public static void main(String[] args) {
		
		Loops3 obj = new Loops3();
		
		for(int i=0;i>10;i++) {
			obj.add();
		}
		System.out.println("for-end");
	}
	public void add() {
		int a = 56;
		int b = 34;
		int c = a+b;
		System.out.println("add:"+c);
	}

}
