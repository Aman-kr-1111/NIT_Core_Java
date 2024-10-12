//Create a
//class Employee(Business Logic Class)
//
//Instance Variables:
//
//Names		 Type--------- ----------------employeeNumber:
//int
//
//employeeName:
//String
//
// employeeSalary:
//double
//
// Access Modifier:public(for
//all variables)
//
//Create a
//parameterized constructor
//to initialilize
//all the
//fields.
// 
// Create another
//
//class Tester(ELC class)
//
//which contains
//main method
//which will
//receive all
//the instance
//variable value
//from BLC class.
//
//In this ELC
//
//class print
//the following
//details
//
//a)
//If salary is>=60000,
//Print Employee
//is a
//Developer
//
// b)
//If salary is>=40000 and<60000,
//Print Employee
//is a
//Designer
//
// c)
//If Salary is<40000,
//Print Employee
//is a
//Tester
//
//
//Input:
//
//232,"Naresh Kumar",43000
//
//Output:
//
//Employee is
//a Designer
//
//Instruction:
//
//Test Cases:========
//
//Parameterized Constructor:
//Checks each
//
//input parameter (name, id, fee) for validity.
//
//--> If id is negative, it sets it to 0 and prints an error
//
//message like (id must be always positive integer)
//--> If fee is negative, it sets it to 0.0 and prints an error
//
//message like (Fee cannot be negative)
//--> If name is null, it sets it to an empty string and prints an error message.(name must initialize with any default name)

package oct10.employee;

public class Employee {
	public int employeeNumber;
	public String employeeName;
	public double employeeSalary;

	public Employee(int employeeNumber, String employeeName, double employeeSalary) {
		if (employeeNumber < 0) {
			this.employeeNumber = 0;
			System.err.println("Employee Number must be a positive integer.");
		} else {
			this.employeeNumber = employeeNumber;
		}

		if (employeeSalary < 0) {
			this.employeeSalary = 0.0;
			System.err.println("Salary cannot be negative.");
		} else {
			this.employeeSalary = employeeSalary;
		}

		if (employeeName == null) {
			this.employeeName = "";
			System.err.println("Name must be initialized with a default value.");
		} else {
			this.employeeName = employeeName;
		}
	}
}
