package mathprogram.day1;

public class AutomaticTypeConversion {
	public static void main(String args[]) {
		int intVariable = 100;
		long longVariable = intVariable;
		float floatVariable = longVariable;
		System.out.println("Integer Value is : " + intVariable);
		System.out.println("Float Value is : " + floatVariable);
		System.out.println("Long Value is : " + longVariable);
	}
}
