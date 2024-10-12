package oct10.employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Aman kr", 43_000);

		if (e1.employeeSalary >= 60_000) {
			System.out.println("Employee is Developer");
		} else if (e1.employeeSalary >= 40_000 && e1.employeeSalary < 60_000) {
			System.out.println("Employee is Designer");
		} else if (e1.employeeSalary < 40_000 && e1.employeeSalary > 0) {
			System.out.println("Employee is Tester");
		}

	}

}
