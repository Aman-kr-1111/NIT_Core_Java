package nov22.employee;

public class FullTimeEmployee implements Employee {
	private int employeeId;
	private String employeeName;
	private double monthlySalary;
	private double benefits;

	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();

		if (monthlySalary < 0) {
			System.err.println("Error: Monthly salary cannot be negative.");
			System.exit(0);
		}

		if (employeeName == null || employeeName.trim().isEmpty()) {
			System.err.println("Error: Employee name cannot be empty.");
			System.exit(0);
		}

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}

	@Override
	public double calculateSalary() {

		return monthlySalary + benefits;
	}

	@Override
	public void generatePayroll() {
		System.out.println("Payroll Information!!!" + "\nEmployee ID: " + employeeId + "\nEmployee Name: "
				+ employeeName + "\nMonthly Salary: " + monthlySalary + "\nBenefits: " + benefits + "\nTotal Salary: "
				+ calculateSalary());
	}

}
