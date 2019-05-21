package pack1;

public class IfElse_DEmo {

	public static void main(String[] args) {
		
		value(55);

	}
	
	public static void value(int a) {
		
		if(a<50) {
			System.out.println(a+": Value is lessthan 50");
		}
		else {
			System.out.println(a+": Value is greterthan 50");
		}
	}
	
	
	public void browser(String browserName)  {
		
		if(browserName.equals("IE")) {
			System.out.println("OPen IE Browser");
		}
		else {
			System.out.println("Open Chrome browser");
		}
	}

}
