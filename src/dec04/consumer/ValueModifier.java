package dec04.consumer;

import java.util.function.Consumer;

public class ValueModifier {
	public static void modifyValue(int value, Consumer<Integer> result) {
		result.accept(value);
	}

	public static void main(String[] args) {
		Consumer<Integer> doubleValue = num -> System.out.println("After doubling the value: " + (num * 2));
		Consumer<Integer> incrementBy = num -> System.out.println("After incrementing the value by 3: " + (num + 3));
		Consumer<Integer> squareValue = num -> System.out.println("After squaring the value: " + (num * num));

		int num = 0;

		doubleValue.accept(num);
		incrementBy.accept(num);
		squareValue.accept(num);
	}

}
