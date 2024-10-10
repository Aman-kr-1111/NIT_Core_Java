//Write a program to calculate the tax for a taxable income of Rs.    9,90,000, if the tax rate is fixed at 4.9%.

package cla.day2;

public class TaxAmount {

	public static void main(String[] args) {
		double taxIcome = 990000;
		final double taxRate = 4.9 / 100;

		double tax = taxIcome * taxRate;
		System.out.println("Tax Amount : " + tax);
	}

}
