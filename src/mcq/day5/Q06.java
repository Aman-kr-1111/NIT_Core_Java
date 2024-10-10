package mcq.day5;

public class Q06 {

	public static void main(String[] args) {
		int temp = 90;
		switch (temp) {
		case 80:
			System.out.println("80");
		case 80:
			System.out.println("80");// error
		case 90:
			System.out.println("90");
		default:
			System.out.println("default");
		}
	}
}
