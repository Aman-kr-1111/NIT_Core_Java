package mathprogram.day1;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		double doubleVariable = 100.04;
		long longVariable = (long) doubleVariable;
		int intVariable = (int) longVariable;
		System.out.println("Double Value is : " + doubleVariable);
		System.out.println("Long Value is : " + longVariable);
		System.out.println("Integer Value is : " + intVariable);
	}
}
