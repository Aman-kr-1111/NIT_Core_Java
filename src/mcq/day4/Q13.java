package mcq.day4;

public class Q13 {

	public static void main(String[] args) {
		int x = 0, y = 1, z;
		if (x) {// error
			z = 0;
		} else {
			z = 1;
		}

		if (y) {
			z = 2;
		} else {
			z = 3;
		}
		System.out.println(z);
	}

}
