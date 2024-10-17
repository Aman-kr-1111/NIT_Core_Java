package oct15.employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee("Shaktiman", 30, "Sales", 50_000, "good");
		printDetails(e1);

		Employee e2 = new Employee("Gangadhar", 25, "HR", 47_000, "average");
		printDetails(e2);

		Employee e3 = new Employee("Divya kri", 22, "ET", 25_000, "null");
		printDetails(e3);

	}

	public static void printDetails(Employee e) {
		System.out.println("Name : " + e.getName());
		System.out.println("Age : " + e.getAge());
		System.out.println("Department : " + e.getDepartment());
		System.out.println("Salary : " + e.updateSalary());
		System.out.println("Performance : " + e.getPerformance());
		System.out.println();
	}
}
