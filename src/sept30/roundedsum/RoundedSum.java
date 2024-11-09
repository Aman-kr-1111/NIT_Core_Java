//Define a method which returns the sum of three rounded numbers.If the right most digit of the number is less than 5,then round off its value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5,and then round off to the next multiple of 10. Write the method with the following specifications:Name of the BLC class:RoundedSum Name of method:sumOfRoundedValues()Access Modifier:public,static Arguments:three argument of type integer Return type:an integer value For example If a=23,b=34,c=66 20+30+70=120 Note:Don'tuse any control statements and looping statements

package sept30.roundedsum;

public class RoundedSum {
	public static int sumOfRoundedValues(int n1, int n2, int n3) {
		return roundNum(n1) + roundNum(n2) + roundNum(n3);
	}

	public static int roundNum(int num) {
		return (num + 5) / 10 * 10;
	}
}
