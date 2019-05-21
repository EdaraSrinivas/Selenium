package pack1;

public class NestedIf_Demo2 {

	public static void main(String[] args) {
		
		int condition = 45;
		
		if(condition==1) {
			// Condition 1 is true;
			if(condition==2) {
				// Condition 1 and 2 are true;
			}
			else if(condition==3) {
				// Condition 1 is true, Condition 2 is false and Condition 3 is true;
			}
			else if(condition==4) {
				// Condition 1 is true, Condition 2 and 3 are false and Condition 4 is true;
			}
			else if(condition==5) {
				// Condition 1 is true, Condition 2,3 and 4 are false and Condition 5 is true;
			}
			else {
				// Condition 1 is true and Conditions 2,3,4 and 5 are false;
			}
			
		}
		else {
			// Condition1 is false;
		}

	}

}
