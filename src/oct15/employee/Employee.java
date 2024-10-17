//You've been assigned the task of developing a Java program to manage employee information and salary updates based on performance evaluations.
//
//Employee Class:[BLC Class]-------------------Create an Employee
//class with
//the following Attributes:--------------
//Names dataType--------- -----------
//name String age
//int department
//String salary
//double performance
//String
//
//Implement
//a constructor
//that takes
//parameters to
//initialize the
//attributes of
//the Employee
//object.
//
//		Provide getter
//and setter methods for
//each attribute
//to ensure
//proper encapsulation.
//
//Update Salary Method:
//
//Method:-------------MethodName:updateSalary()
//Return Type		:double
//Access Modifier 	:
//
//public
//
//Implement a
//method named
//updateSalary within
//the Employee class.
//This method
//should update
//the salary
//based on the employee's
//performance evaluation.
//
//notes:
//If the
//performance is"good",
//add a
//bonus of?10,000
//to the
//salary.If the
//performance is"average",
//add a
//bonus of?5,000
//to the
//salary.If the
//performance is null,
//no bonus
//is added.
//
//Create a EmployeeTester class[
//ELC Class]
//In the
//main method:
//Create at
//least three
//Employee objects
//with different
//performance evaluations.
//Call the
//updateSalary method for
//each employee.
//Print the
//updated salaries
//of all
//employees.
//
//		Test Cases:---------------case-1---------Name:
//shaktiman Age:30 Department:
//Sales Salary:50000 Performance:
//good
//
//Expected Output:
//
//valid input (print all the above details)
//
//case-2
//--------
//Sample Input :
//
//Name: Gangadhar
//Age: -25
//Department: HR
//Salary: 47000
//Performance: good
//
//Expected Output :
//Invalid input. Age must be a positive integer.
//

package oct15.employee;

public class Employee {
	private String name;
	private int age;
	private String department;
	private double salary;
	private String performance;

	public Employee() {
		super();
	}

	public Employee(String name, int age, String department, double salary, String performance) {
		super();
		this.name = name;
		if (age > 0) {
			this.age = age;
		} else {
			System.err.println("Invalid input. Age must be a positive integer.");
			System.exit(0);
		}
		this.department = department;
		this.salary = salary;
		this.performance = performance;
	}

	public String getName() {
		return name;
	}

	public int getAge() {

		return age;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public String getPerformance() {
		return performance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.err.println("Invalid input. Age must be a positive integer.");
			System.exit(0);
		}
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public double updateSalary() {
		if (performance.equals("good")) {
			salary += 10_000;
		} else if (performance.equals("average")) {
			salary += 5_000;
		}
		return salary;
	}
}
