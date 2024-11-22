package nov22.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee(1, "Aman kr", 3000.0, 500.0);
		e1.generatePayroll();
	}

}
