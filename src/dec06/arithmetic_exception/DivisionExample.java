package dec06.arithmetic_exception;

import java.util.Scanner;

public class DivisionExample {
	public static int performDivision(int dividend, int divisor) {

		if (divisor == 0) {
			throw new ArithmeticException("Division by zero: dividend=" + dividend + ", divisor=" + divisor);
		}
		return dividend / divisor;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter dividend: ");
			int dividend = scanner.nextInt();
			System.out.print("Enter divisor: ");
			int divisor = scanner.nextInt();

			System.out.println("Result of division: " + performDivision(dividend, divisor));
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught: " + e.getMessage());
		}

		scanner.close();
	}

}
