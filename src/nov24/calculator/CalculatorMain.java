package nov24.calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new SimpleCalculator();
		calculator.calculateSum(1, 2, 3);

		calculator.calculateSum(10, 20, 30, 40);

		calculator.calculateSum(5);

		calculator.calculateSum();
	}

}
