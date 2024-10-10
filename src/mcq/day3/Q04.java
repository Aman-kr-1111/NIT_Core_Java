package mcq.day3;

public class Q04 {

	public static void main(String[] args) {
		int a = 21;
		int b = a;
		System.out.println(b);// 21

		b += a;
		System.out.println(b);// 42

		a *= a;
		System.out.println(a);// 441
	}

}
