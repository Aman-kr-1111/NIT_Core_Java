//Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.

package cla.day4;

public class SimpleInterest {

	public static void main(String[] args) {
		double principal = 10_000;
		int time = 3;
		double rate = 0.05;
		double si = principal * rate * time;

		System.out.println("Simple Interest : " + si);
	}

}
