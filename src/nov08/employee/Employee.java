//Question-3-------------
//
//Create a
//class Employee(BLC Class)
//
//Attributes:
//
//names           		datatype-------------------hoursWorked:
//double hourlyRate:
//double annualSalary:
//double salesAmount:
//double
//
//Acess modifier:private for
//all varriables
//
//Implement three constructors:
//
//One for
//an hourly
//employee that
//accepts hoursWorked
//and hourlyRate.
//
//One for
//a salaried
//employee that
//accepts annualSalary.
//
//One for
//a commission
//employee that
//accepts salesAmount
//and commissionRate.
//
//Methods:------------
//method name:calculateSalary()
//Return type 	        :double
//Acess Modifier	:public
//
// ->for calculating the salary of an hourly employee.
//
//method name 	:calculateSalary(double annualSalary)
//Return type 	        :double
//Acess Modifier	:public
//
//-> for calculating the salary of a salaried employee.
//
//method name 	:calculateSalary(double salesAmount, double commissionRate)
//Return type 	        :double
//Acess Modifier	:public
//
//->for calculating the commission of a commission-based employee.
//
//Create a Tester
//
//Class(ELC Class) Create instances of each type of employee.
//Calculate and display the salary for each employee type using the appropriate method.
//
//
//Test Cases :
//--------------
//Case 1:
//--------
//Hourly Employee
//
//Input: hoursWorked = 160, hourlyRate = 15
//
//Expected Output: Monthly salary of hourly employee: 2400.0
//
// Case 2:
//----------
// Salaried Employee
//Input : annualSalary = 60000
//
//Expected Output : Monthly salary of salaried employee: 5000.0
//
// Case 3:
//---------
// Commission Employee
//Input: salesAmount = 50000, commissionRate = 0.10
//Expected Output: Commission of employee: 5000.0

package nov08.employee;

public class Employee {
	private double hoursWorked;
	private double hourlyRate;
	private double annualSalary;
	private double salesAmount;

	public Employee(double hoursWorked, double hourlyRate) {
		super();
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public Employee(double annualSalary) {
		super();
		this.annualSalary = annualSalary;
	}

	public Employee(double salesAmount, double commissionRate) {
		this.salesAmount = salesAmount;
		this.hourlyRate = commissionRate;
	}

}
