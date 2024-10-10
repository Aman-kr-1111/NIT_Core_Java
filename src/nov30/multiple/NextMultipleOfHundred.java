//Define a method which returns the next multiple of 100 for the given number.Write the method with the following specifications:Name of the BLC class:NextMultipleOfHundred Name of method:getNextMultipleOfHundred()Access Modifier:public,static Arguments:one argument of type integer Return type:an integer value For example,If the given value is 123,return 200.

package nov30.multiple;

public class NextMultipleOfHundred {
	public static int getNextMultipleOfHundred(int num) {
		return (num / 100 + 1) * 100;
	}
}
