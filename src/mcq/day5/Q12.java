package mcq.day5;

public class Q12 {

	public static void main(String[] args) {
		int j = 3;
		switch (j) {
		case 2:
			System.out.println("value is two");
		case 2 + 1:
			System.out.println("value is three");
			break;
		default:
			System.out.println("value is " + j);
			break;
		}

	}

}
