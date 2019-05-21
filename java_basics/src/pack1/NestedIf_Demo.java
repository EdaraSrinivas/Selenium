package pack1;

public class NestedIf_Demo {

	public static void main(String[] args) {
		
		int condition = 45;
		
		if(condition==1) {
			// condition1 is true;
			if(condition==2) {
				// Condition 1 and 2 are true;
			}
			else {
				// condition 1 is true and condition 2 is false;
			}
		}
		else {
			// Condition1 is false;
		}

	}

}
