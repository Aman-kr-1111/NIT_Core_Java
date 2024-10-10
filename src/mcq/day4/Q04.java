package mcq.day4;

public class Q04 {

	public static void main(String[] args) {
		int z = 5;
		if (++z > 5 || ++z > 6) {
			z++;
		}
		System.out.println(z);// 7
	}

}
