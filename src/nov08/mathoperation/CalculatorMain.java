package nov08.mathoperation;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();

		double num1 = 10.5, num2 = 20.3;
		System.out.println("Sum of " + num1 + " and " + num2 + " (double): " + c1.add(num1, num2));

		int num3 = 10, num4 = 20;
		System.out.println("Product of " + num3 + " and " + num4 + " (int): " + c1.multiply(num3, num4));

		int num5 = -10, num6 = 20;
		System.out.println("Sum of " + num5 + " and " + num6 + " (int): " + c1.add(num5, num6));

	}

}
