package pack2;

public class Throw_DEmo {

	public static void main(String[] args) {
		
		
		// Always the id is 4 digit number
		stuId(3456);
		stuId(23);

	}
	
	public static void stuId(int id) {
		
		if(id>1000 && id<9999) {
			System.out.println("Studentid:"+id);
		}
		else {
			throw new RuntimeException("Invalid id: Always the id must be 4 digit number");
		}
	}

}
