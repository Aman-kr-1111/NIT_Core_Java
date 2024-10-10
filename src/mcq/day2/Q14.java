package mcq.day2;

public class Q14 {

	public static void main(String[] args) {
		long b1 = 10L;
		byte b2 = (int) b1;// error
		byte result = b1 + b2;
		System.out.println(result);

	}

}
