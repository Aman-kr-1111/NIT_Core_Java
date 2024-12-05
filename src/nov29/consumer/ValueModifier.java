package nov29.consumer;

import java.util.function.Consumer;

public class ValueModifier {
	public static void main(String[] args) {
		Consumer<String> stringConsumer = s -> System.out
				.println("After converting string to uppercase: " + s.toUpperCase());
		Consumer<Integer> integerConsumer = n -> System.out.println("After squaring the integer: " + (n * n));

		String str = "example";
		int num = 4;

		System.out.println("Original string: " + str);
		System.out.println("Original integer: " + num);
		stringConsumer.accept(str);
		integerConsumer.accept(num);
	}
}
