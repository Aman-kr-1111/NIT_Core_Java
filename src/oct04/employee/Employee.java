//Write a Program on OOPs to define Employee
//class properties
//and behaviour.
//
//properties:employeeId:
//int employeeName:
//String employeeSalary:
//double
//
//Initialize
//these properties
//with the
//help of
//Methods using Scanner
//
//class not
//by using
//Object reference.
//
//behavior:
//
//setEmployeeData() : public void
//getEmployeeData() : public void
//
//
//Note : Create two more programs based on your imagination

package oct04.employee;

import java.util.Scanner;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;

	public void setEmployeeData() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee id : ");

		employeeId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter employee name : ");
		employeeName = sc.nextLine();

		System.out.print("Enter employee salary : ");

		employeeSalary = sc.nextDouble();
		sc.close();
	}

	public void getEmployeeData() {

		System.out.println("Employee id : " + employeeId);
		System.out.println("Employee name : " + employeeName);
		System.out.println("Employee salary : " + employeeSalary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmployeeData();
		e1.getEmployeeData();
	}

}
