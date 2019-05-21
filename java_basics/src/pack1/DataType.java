package pack1;

public class DataType {

	public static void main(String[] args) {
		
		// To store the whole Numbers
		byte a = 127;
		System.out.println(Byte.MIN_VALUE+","+Byte.MAX_VALUE);
		int b = 34;
		System.out.println(Integer.MIN_VALUE+","+Integer.MAX_VALUE);
		short c = 98;
		System.out.println(Short.MIN_VALUE+","+Short.MAX_VALUE);
		long d = 56L;
		System.out.println(Long.MIN_VALUE+","+Long.MAX_VALUE);
		System.out.println("-------------------");
		// Store the decimal Numbers
		double f = 56.23;
		System.out.println(Double.MIN_VALUE+","+Double.MAX_VALUE);
		float g = 56.23F;
		System.out.println(Float.MIN_VALUE+","+Float.MAX_VALUE);
		// Store the character
		char r = 'e';
		char r1 = '3';
		char r2 = '$';
		
		// Store the true/false
		boolean t = true; // 1
		boolean t1 = false;	// 0
	}

}
