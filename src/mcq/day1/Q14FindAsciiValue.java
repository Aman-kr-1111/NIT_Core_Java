//Write a java program to find the ASCII value of a character
//For Example
//Output sholud be in below formart
//The ASCII value of a is :97

package mcq.day1;

public class Q14FindAsciiValue {

	public static void main(String[] args) {
		int asciiVal = args[0].charAt(0);
		System.out.println("The ASCII value of a is : " + asciiVal);
	}
}
