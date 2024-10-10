//Write a program to find the sum and average of three numbers where number must be taken from command line argument.

package cla.day2;

public class SumAndAvg {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);

		int sum = num1 + num2 + num3;
		double avg = sum / 3.0;

		System.out.println("Sum : " + sum);
		System.out.println("Average : " + avg);

	}

}
