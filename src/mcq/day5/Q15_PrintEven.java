// WAP in java to print all even numbers from 1 - 100

package mcq.day5;

public class Q15_PrintEven {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
