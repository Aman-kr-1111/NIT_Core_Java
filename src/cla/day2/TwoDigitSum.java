//Write a program to accept a two digit number from command line argument and find the sum of digit. (Example : 54   5 + 4 =9)

package cla.day2;

public class TwoDigitSum {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int digit1 = num % 10;
		int digit2 = num / 10;
		int sum = digit1 + digit2;

		System.out.println(digit2 + " + " + digit1 + " = " + sum);
	}

}
