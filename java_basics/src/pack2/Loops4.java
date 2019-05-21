package pack2;

public class Loops4 {

	public static void main(String[] args) {
		
		Loops4 obj = new Loops4();
		int i = 3;
		while(i>1) {
			obj.add();
		}
		System.out.println("while-end");
	}
	public void add() {
		int a = 56;
		int b = 34;
		int c = a+b;
		System.out.println("add:"+c);
	}

}
