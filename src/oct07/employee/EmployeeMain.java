package oct07.employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setEmployeeData("Aman", "Kumar", 101, 20_000, 10);

		e1.calculateSalary();
		System.out.println("Salary : " + e1.displayDetails());
	}

}
