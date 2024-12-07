package dec04.predicate;

import java.util.function.Predicate;

public class CalculationLogic {

	public static boolean testPredicate(int num, Predicate<Integer> result) {
		return result.test(num);
	}

	public static void main(String[] args) {
		Predicate<Integer> isEven = num -> num % 2 == 0;
		Predicate<Integer> isGreaterThanTen = num -> num > 10;
		Predicate<Integer> isPrime = num -> {
			if (num <= 1) {
				return false;
			}

			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		};
		int number = 17;
		System.out.println(number + " is even: " + testPredicate(number, isEven));
		System.out.println(number + " is greater than 10: " + testPredicate(number, isGreaterThanTen));
		System.out.println(number + " is prime: " + testPredicate(number, isPrime));
	}

}
