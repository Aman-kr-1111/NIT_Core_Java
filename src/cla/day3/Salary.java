//Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
//Take the Basic Salary from Command Line Argument

package cla.day3;

public class Salary {
	public static void main(String[] args) {
		double basicSalary = Double.parseDouble(args[0]);
		double HRA = basicSalary * 0.15;
		double convAllowance = basicSalary * 0.15;
		double entAllowance = basicSalary * 0.10;
		double totalSalary = basicSalary + HRA + convAllowance + entAllowance;

		System.out.println("Total Salary : " + totalSalary);
	}

}
