package pack1;

public interface Interface_New {

	
	public abstract void m1();
	public abstract void m3();
	public abstract void m4();
	public abstract void m5();
	
	default void m2() {
		// The implementation of this functionality can be used for all the abstract methods of it in an implementation class 
	}
	
	default void m6() {
		
	}
	
	public static void m7() {
		
	}
	
}
