package pack1;

public class EmployeeDetails {
	
	int empId;
	String empName;
	String empAddress;
	int empMobile;
	
	public static void main(String[] args) {
		
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.empId = 2345;
		emp1.empName = "sri";
		emp1.empAddress = "abc";
		emp1.empMobile = 908745321;
		
		
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.empId = 2345897;
		emp2.empName = "srinivas";
		emp2.empAddress = "abc";
		emp2.empMobile = 909745321;

	}

}
