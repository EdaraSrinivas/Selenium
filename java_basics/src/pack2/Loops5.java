package pack2;

public class Loops5 {

	public static void main(String[] args) {
		
		Loops5 obj = new Loops5();
		
		int i = 3;
		
		do {
			obj.add();
			i--;
		}while(i>1);
		
		System.out.println("while-end");
	}
	public void add() {
		int a = 56;
		int b = 34;
		int c = a+b;
		System.out.println("add:"+c);
	}

}
