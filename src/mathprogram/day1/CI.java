//write a Java program to calculate compound interest for 3 years? 
// Formula- amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));

package mathprogram.day1;

import java.text.DecimalFormat;

public class CI {

	public static void main(String[] args) {
		double principal = 1000;
		double rate = 35;
		rate = 1 + rate / 100;
		double amount = principal * rate * rate * rate;

		double ci = amount - principal;
		DecimalFormat dFormat = new DecimalFormat("00.00");

		System.out.println("Compound Interest : " + dFormat.format(ci));
	}
}
