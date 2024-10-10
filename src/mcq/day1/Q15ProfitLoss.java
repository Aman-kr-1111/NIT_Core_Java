//Write a java program to find the profit and loss by following the formula
//Profit and loss Formulas   
//Profit = SP- CP
//Loss = CP - SP
//Profit percentage = (Profit /Cost Price) x 100
//Loss percentage = (Loss / Cost price) x 100

package mcq.day1;

public class Q15ProfitLoss {

	public static void main(String[] args) {
		int costPrice = 1000;
		int sellPrice = 1500;

		if (costPrice < sellPrice) {
			int profit = sellPrice - costPrice;
			System.out.println("Profit : " + profit);
			System.out.println("Profit % : " + (profit * 100 / costPrice) + "%");
		} else {
			int loss = costPrice - sellPrice;
			System.out.println("Loss : " + loss);
			System.out.println("Loss % : " + (loss * 100 / costPrice) + "%");
		}

		System.out.println("Short range" + Short.MIN_VALUE);
	}
}
