//Write a Java program to check if a given number is a palindrome. A number is a palindrome if it remains the same when its digits are reversed.

package cla.day3;

public class Palindrome {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		System.out.println(num + " is " + (num == reverseNum(num) ? "a " : "not a ") + "palindrome number");
	}

	public static int reverseNum(int num) {
		int revNum = 0;

		while (num > 0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			num /= 10;
		}

		return revNum;
	}
}
