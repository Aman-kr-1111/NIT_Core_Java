//Write a program in Java that will generate and print the bill at Dominos for four chicken rolls(@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as well as all item bill.

package cla.day3;

public class DominosBill {

	public static void main(String[] args) {
		int chickenRoll = 60;
		int vegetablePuffs = 25;

		int totalChickenCost = 4 * chickenRoll;
		int totalPuffCost = 3 * vegetablePuffs;
		System.out.println("4 chicken roll cost : " + totalChickenCost);
		System.out.println("3 vegetable puffs cost : " + totalPuffCost);

		int finalBill = totalChickenCost + totalPuffCost - 50;
		System.out.println("Total bill : " + finalBill);
	}

}
