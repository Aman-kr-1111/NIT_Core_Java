package oct14.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];

		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter details for Employee " + (i + 1) + " !!!");
			emp[i] = Employee.getEmployeeObject();
			System.out.println();
		}

		System.out.println("All employees Details!!!");
		for (Employee e : emp) {
			System.out.println(e);
		}
	}

}
