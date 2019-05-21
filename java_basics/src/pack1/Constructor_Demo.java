package pack1;

public class Constructor_Demo {

	int a;
	double b;
	boolean flag;
	
	
	public static void main(String[] args) {
		
		Constructor_Demo obj = new Constructor_Demo();
		Constructor_Demo obj1 = new Constructor_Demo(56,23.34,true);
	}

	public Constructor_Demo() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(flag);
	}
	
	public Constructor_Demo(int a,double b,boolean flag) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(flag);
	}
	
	
}
