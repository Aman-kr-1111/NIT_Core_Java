package dec04.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator {
	public static int generateRandomNumber(int min, int max) {
		Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * (max - min + 1)) + min;
		return randomNumberSupplier.get();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the minimum value: ");
		int min = sc.nextInt();

		System.out.print("Enter the maximum value: ");
		int max = sc.nextInt();

		System.out.println("Random number generated: " + generateRandomNumber(min, max));

		sc.close();
	}

}
