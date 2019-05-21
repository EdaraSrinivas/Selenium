package pack2;

public class Sample4 implements Interface1 {
	
	public static void main(String[] args) {
		
		Interface1 obj = new Sample4();
		obj.m1();
		
		Sample4 obj1 = new Sample4();
		
		
	}
	
	public void p1() {
		System.out.println("p1");
	}
	public void p2() {
		System.out.println("p2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");
	}

}
