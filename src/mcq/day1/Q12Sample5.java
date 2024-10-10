package mcq.day1;

public class Q12Sample5 {
	public static void main(String args[]) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println("result = " + result);
	}

//(5.67*42) + (50000/97) - (0.1234*1024);
//238.14 + 515.46 - 126.36 
//627.24

}
