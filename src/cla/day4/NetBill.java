//A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as follows:
//
//     Net Bill in Rupees			    Discount %
//	<5000					5
//	>=5000 and <10000			10
//	>=10000					15
//
//Display Discount %, Discount Amount and Amount Payable

package cla.day4;

public class NetBill {

	public static void main(String[] args) {
		double netBill = Double.parseDouble(args[0]);

		double disc = 0;
		if (netBill < 5000) {
			disc = 5;
		} else if (netBill < 10000) {
			disc = 10;
		} else if (netBill >= 10000) {
			disc = 15;
		}

		double discAmt = disc * netBill / 100;
		double payableAmt = netBill - discAmt;

		System.out.println("Discount % : " + disc);
		System.out.println("Discount amount : " + discAmt);
		System.out.println("Payable amount : " + payableAmt);
	}

}
