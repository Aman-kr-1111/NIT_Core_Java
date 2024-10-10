//A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. Display total selling price, profit along with vat and service charge.

package cla.day4;

public class TvCharge {

	public static void main(String[] args) {
		double costPrice = 32_500;
		double profit = costPrice * 0.27;
		double sellPrice = costPrice + profit;
		double vat = sellPrice * 0.127;
		double serviceCharge = costPrice * 0.0387;
		double totalPrice = sellPrice + vat + serviceCharge;

		System.out.println("Profit : " + profit);
		System.out.println("VAT : " + vat);
		System.out.println("Service Charge : " + serviceCharge);
		System.out.println("Total Selling Price : " + totalPrice);
	}

}
