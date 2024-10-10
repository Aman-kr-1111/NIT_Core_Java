//Define a method which returns the sum of digits of the given two digit number.Write the method with the following specifications:Name of the BLC class:TwoDigitsSum Name of method:getSumOfDigits()Access Modifier:public,static Arguments:one argument of type integer Return type:an integer value For example,If the given value is 34,return 7

//Create an ELC class Main to test the application

package nov30.digitsum;

public class TwoDigitSum {
	public static int getSumOfDigits(int num) {
		return (num % 10) + (num / 10);
	}
}
