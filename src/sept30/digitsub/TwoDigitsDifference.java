//Define a method which returns the difference of digits of the given two digit number.Write the method with the following specifications:Name of the BLC class:TwoDigitsDifference Name of method:getDiffOfDigits()Access Modifier:public,static Arguments:one argument of type integer Return type:an integer value For example,If the given value is 83,8-3 return 5. If x=38,3-8 return-5.

package sept30.digitsub;

public class TwoDigitsDifference {
	public static int getDiffOfDigits(int num) {
		return (num / 10) - (num % 10);
	}
}
