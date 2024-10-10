//Write a program to perform addition,subtraction, multiplication and division between two numbers using 3rd variable.

package cla.day1;

public class Arithmetic_Operations {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;

		System.out.println(num1 + " + " + num2 + " = " + add);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + mul);
		System.out.println(num1 + " / " + num2 + " = " + div);
	}
}
