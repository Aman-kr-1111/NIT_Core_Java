// WAP in java to print table of the given number (Number must be taken from Scanner class)

package mcq.day5;

import java.util.Scanner;

public class Q17_PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");

		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		sc.close();

	}

}
