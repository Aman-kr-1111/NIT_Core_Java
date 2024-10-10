package mcq.day5;

public class Q10 {

	public static void main(String[] args) {
		short x = 200;
		switch (x) {
		case 100:
			System.out.println("One hundred");
			break;
		case 200:
			System.out.println("Two hundred");
			break;
		case 33000://error
			System.out.println("Thirty thousand ");
			break;
		}
	}
}
