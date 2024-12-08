package dec05.number_and_null_exception;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void handleExceptions(String str) {
		try {
			System.out.println("Length of the input string: " + str.length());
			int num = Integer.parseInt(str);
			System.out.println("Converted number: " + num);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: Invalid input, not a number.");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: Attempted to operate on a null object");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string to convert to an integer: ");
		String str = scanner.nextLine();

		handleExceptions(str);
		scanner.close();
	}

}
