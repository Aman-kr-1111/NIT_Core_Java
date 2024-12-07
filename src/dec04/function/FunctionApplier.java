package dec04.function;

import java.util.function.Function;

public class FunctionApplier {

	public static int applyFunction(int value, Function<Integer, Integer> result) {
		return result.apply(value);
	}

	public static void main(String[] args) {
		Function<Integer, Integer> add = n -> n + 5;
		Function<Integer, Integer> multiply = n -> n * 2;
		Function<Integer, Integer> subtract = n -> n - 3;

		int num = 100;
		System.out.println("After adding 5: " + applyFunction(num, add));
		System.out.println("After multiplying by 2: " + applyFunction(num, multiply));
		System.out.println("After subtracting 3: " + applyFunction(num, subtract));
	}

}
