package dec05.simple_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the first integer (a): ");
			int a = scanner.nextInt();
			System.out.print("Enter the second integer (b): ");
			int b = scanner.nextInt();

			System.out.println("You entered a: " + a + " and b: " + b);

		} catch (InputMismatchException e) {
			System.out.println("An InputMismatchException occurred.");
			System.out.println("Message: " + e.getMessage());
			System.out.println("String representation: " + e.toString());
			System.out.print("Stack trace: ");
			e.printStackTrace();
		}
		scanner.close();
	}

}
