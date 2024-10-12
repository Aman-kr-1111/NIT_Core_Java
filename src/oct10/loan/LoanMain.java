package oct10.loan;

import java.text.DecimalFormat;

public class LoanMain {

	public static void main(String[] args) {
		Loan l1 = new Loan(1_00_000, 5.5, 36);
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println("Principal : " + l1.getPrincipal());
		System.out.println("Interest Rate : " + l1.getInterestRate());
		System.out.println("Duration : " + l1.getDurationMonths() + " months");

		System.out.println("Monthly payment : " + df.format(l1.calculateMonthlyPayment()));
	}

}
