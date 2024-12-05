package nov29.Function;

import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) {
		Function<String, Integer> getStringLength = str -> str.length();
		Function<Integer, Double> divideAndFormat = num -> num / 2.0;

		String testString = "";
		int testInteger = 8;

		System.out.println("String length of " + testString + ": " + getStringLength.apply(testString));

		System.out.println("Result of dividing " + testInteger + " by 2: " + divideAndFormat.apply(testInteger));

	}

}
