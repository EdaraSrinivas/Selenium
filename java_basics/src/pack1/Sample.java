package pack1;

public class Sample {

	public static void main(String[] args) {
		
		Sample obj = new Sample();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

	public void m1() {
		System.out.println("m1");
	}
	
	private void m2() {
		System.out.println("M2");
	}
	
	protected void m3() {
		System.out.println("M3");
	}
	
	void m4() {
		System.out.println("M4");
	}
	
}
