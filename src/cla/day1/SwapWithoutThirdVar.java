//Write a program to swap to numbers without using 3rd variable using 
//    command line argument.

package cla.day1;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

//		First method
//		System.out.println("Before swapping!!!\nnum1 : " + num1 + " and num2 : " + num2);
//		num1 += num2;
//		num2 = num1 - num2;
//		num1 -= num2;
//		System.out.println("\nAfter swapping!!!\nnum1 : " + num1 + " and num2 : " + num2);

//		Second method
//		System.out.println("Before swapping!!!\nnum1 : " + num1 + " and num2 : " + num2);
//		num1 *= num2;
//		num2 = num1 / num2;
//		num1 /= num2;
//		System.out.println("\nAfter swapping!!!\nnum1 : " + num1 + " and num2 : " + num2);

//		Third method
		System.out.println("Before swapping!!!\nnum1 : " + num1 + " and num2 : " + num2);
		num1 ^= num2;
		num2 = num1 ^ num2;
		num1 ^= num2;
		System.out.println("\nAfter swapping!!!\nnum1 : " + num1 + " and num2 : " + num2);

	}

}
