package nov08.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee hourlyEmployee = new Employee(160D, 15D);
		double hourlySalary = hourlyEmployee.calculateSalary();
		System.out.println("Monthly salary of hourly employee: " + hourlySalary);

		// Case 2: Salaried Employee
		Employee salariedEmployee = new Employee(60000);
		double monthlySalary = salariedEmployee.calculateSalary(60000);
		System.out.println("Monthly salary of salaried employee: " + monthlySalary);

		// Case 3: Commission Employee
		Employee commissionEmployee = new Employee(50000, 0.10F);
		double commission = commissionEmployee.calculateSalary(50000, 0.10);
		System.out.println("Commission of employee: " + commission);
	}

}
