package test.oct05.mcq;

public class Test21 {
	public static void main(String[] argv) {
		int i = 6;
		long l = 7l;
		short s = 7;
		s += i += l += s;
		// l = 7 + 7 = 14
		// i = 6 + 14 = 20
		// s = 7 + 20 = 27
		System.out.println(s);// 27
		byte b = (byte) (char) (int) (i + l + s);// 20 + 14 + 27 = 61
		System.out.println(b);// 61
	}
}

//a. Compile Time Error
//b. 27 61
//C. 27 60
//d. 26 63
//
//Ans : b
