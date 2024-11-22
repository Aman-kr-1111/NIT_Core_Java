package nov22.arithmetic;

public class MyCalculator implements AdvancedArithmetic {
	@Override
	public int divisorSum(int num) {
		if (num <= 0) {
			System.err.println("Error: Input must be a positive integer.");
			System.exit(0);
		}

		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		return sum + num;
	}
}
