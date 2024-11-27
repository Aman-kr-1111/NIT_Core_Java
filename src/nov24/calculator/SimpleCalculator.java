package nov24.calculator;

public class SimpleCalculator implements Calculator {

	@Override
	public void calculateSum(int... num) {
		int sum = 0;
		for (int n : num) {
			sum += n;
		}

		System.out.println("Sum of the numbers: " + sum);
	}

}
