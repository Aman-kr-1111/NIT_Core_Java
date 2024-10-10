package mcq.day4;

public class Q03 {

	public static void main(String[] args) {
		int a = 20, b = 10;

		if ((a < b) & (++b < 20)) {
			System.out.println("Boolean AND ");
		} else {
			System.out.println("b value is : " + b);// 11
		}

	}

}
