package mcq.day4;

public class Q16 {

	public static void main(String[] args) {
		byte b = 0;
		b += 27;
		b = b + 28;// error
		b = (byte) (b + 29);
	}
}
