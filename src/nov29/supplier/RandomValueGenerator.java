package nov29.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomValueGenerator {

	public static void main(String[] args) {
		Random random = new Random();
		Supplier<String> stringSupplier = () -> {
			int randomDigits = 1000 + random.nextInt(9000);
			return "NIT" + randomDigits;
		};

		int min = 10;
		int max = 100;
		Supplier<Integer> integerSupplier = () -> min + random.nextInt(max - min + 1);
		String randomString = stringSupplier.get();
		int randomInteger = integerSupplier.get();

		System.out.println("Generated random string: " + randomString);
		System.out.println("Generated random integer: " + randomInteger);
	}

}
