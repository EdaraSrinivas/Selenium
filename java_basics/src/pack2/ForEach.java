package pack2;

public class ForEach {

	public static void main(String[] args) {
		
		int a[] = {34,12,34,56,37,87,100,2312};
		
		System.out.println(a);
		// Size
	//	System.out.println(a.length);
		
	/*	System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
*/
		
	/*	for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	*/	
		// Foreach
		
		for(int b:a) {
			System.out.println(b);
		}
		
	}

}
