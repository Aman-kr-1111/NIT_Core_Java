package nov21.food;

import java.util.Scanner;

public class FoodMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of food items : ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\n***** We have 2 food items *****");
			System.out.println("1: Egg");
			System.out.println("2: Bread");
			System.out.print("Enter your number : ");
			int foodName = sc.nextInt();

			// Food object initialization
			Food food;
			if (foodName == 1) {
				food = new Egg(6.0, 5.0, 0.5); // Example macros for Egg
			} else if (foodName == 2) {
				food = new Bread(4.0, 1.1, 13.8); // Example macros for Bread
			} else {
				System.out.println("Invalid food item");
				continue;
			}

			// Process method calls
			for (int j = 0; j < 3; j++) {
				System.out.println("\n***** We have 3 method for call *****");
				System.out.println("1 : getType");
				System.out.println("2 : getMacros");
				System.out.println("3 : getTaste");
				System.out.print("Enter your number : ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println(food.getType());
					break;
				case 2:
					food.getMacroNutrients();
					break;
				case 3:
					System.out.println("Taste: " + food.getTaste());
					break;
				default:
					System.out.println("Invalid input");
				}

				System.out.println();
			}
		}

		sc.close();
	}
}
