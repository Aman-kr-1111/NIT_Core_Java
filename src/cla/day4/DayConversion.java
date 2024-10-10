//Write a program in java to input number of days. Find and display number of years, months and days.

package cla.day4;

public class DayConversion {

	public static void main(String[] args) {
		int days = 567;

		int years = days / 365;
		int rem = days % 365;

		int months = rem / 30;
		rem %= 30;

		System.out.println(days + " days = " + years + " years " + months + " months " + rem + " days");

	}

}
