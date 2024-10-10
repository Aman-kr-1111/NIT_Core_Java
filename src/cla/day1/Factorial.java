//Write a Java program to calculate the factorial of a number where number must be taken from command line argument.
//arithmetic

package cla.day1;

public class Factorial {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact *= i;

		}

		System.out.println("Factorial of " + num + " is : " + fact);
	}

}
