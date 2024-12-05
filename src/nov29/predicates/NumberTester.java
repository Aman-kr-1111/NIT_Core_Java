package nov29.predicates;

import java.util.function.Predicate;

public class NumberTester {
	public static boolean testPredicate(int number, Predicate<Integer> predicate) {
		return predicate.test(number);
	}

	public static void main(String[] args) {
		Predicate<Integer> isEven = number -> number % 2 == 0;

		Predicate<Integer> isPrime = number -> {
			if (number <= 1) {
				return false;
			}

			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		};

		int sampleNumber = 20;

		System.out.println("Is " + sampleNumber + " even? " + isEven.test(sampleNumber));

		System.out.println("Is " + sampleNumber + " prime? " + testPredicate(sampleNumber, isEven) + "\n");
		System.out.println("Is " + sampleNumber + " even? " + isPrime.test(sampleNumber));

		System.out.println("Is " + sampleNumber + " prime? " + testPredicate(sampleNumber, isPrime));
	}
}
