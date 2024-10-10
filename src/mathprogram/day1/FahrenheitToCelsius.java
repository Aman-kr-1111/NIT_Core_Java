package mathprogram.day1;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double fahrenheit = 53.6;
		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println(fahrenheit + "°F = " + celsius + "°C");
	}
}
