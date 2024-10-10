package oct01.evenodd;

public class EvenOrOddMain {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(num + " is an " + (EvenOrOdd.isEven(num) ? "even" : "odd") + " number");
	}
}
