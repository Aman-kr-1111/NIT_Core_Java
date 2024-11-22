package nov22.arithmetic;

public class CalulatorMain {

	public static void main(String[] args) {
		AdvancedArithmetic adA = new MyCalculator();
//		System.out.println("Sum of divisors: " + adA.divisorSum(6));

//		System.out.println("Sum of divisors: " + adA.divisorSum(-6));

//		System.out.println("Sum of divisors: " + adA.divisorSum(0));

		System.out.println("Sum of divisors: " + adA.divisorSum(28));

	}

}
