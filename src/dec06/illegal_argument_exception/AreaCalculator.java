package dec06.illegal_argument_exception;

import java.util.Scanner;

public class AreaCalculator {
	public static double calculateArea(double length, double width) {
		if (length < 0 || width < 0) {
			throw new IllegalArgumentException("Dimensions must be positive: length=" + length + ", width=" + width);
		}

		return length * width;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter length of rectangle: ");
			double length = scanner.nextDouble();
			System.out.print("Enter width of rectangle: ");
			double width = scanner.nextDouble();

			System.out.println("Area of rectangle with length " + length + " and width " + width + " is: "
					+ calculateArea(length, width));
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught: " + e.getMessage());
		}
		scanner.close();
	}

}
