//Write a program to perform addition using command line Argument.

package cla.day1;

public class AddWithCLA {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
}
