package pack2;

public class TryCatchFinally8 {

	public static void main(String[] args) {
		
		try {
			// Critical statements which may raise an exception
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			// Solution for the ArithmeticException which raises in the try-block or
			// Solution for the NullPointerException which raises in the try-block or
			// Solution for the ArrayIndexOutOfBoundsException which raises in the try-block
		}	
	}
}