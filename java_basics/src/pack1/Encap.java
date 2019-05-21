package pack1;

public class Encap {

	public static void main(String[] args) {
		
		Encap obj = new Encap();
		obj.add();
		obj.add(34, 12, 56);
		
		Encap obj1 = new Encap();
	}

	public void add() {
		int a = 89;
		int b = 23;
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println(d);
	}
}
