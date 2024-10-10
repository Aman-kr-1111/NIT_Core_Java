package mcq.day3;

public class Q16 {
	static int i = 5;

	public static void main(String[] args) {
		System.out.println(i++);// 5
		System.out.println(i);// 6
		System.out.println(++i);// 7
		System.out.println(++i + i++);// 16
	}
}
