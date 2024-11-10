package test.oct05.mcq;

public class Test20 {
	public static void main(String[] argv) {
		float f = 10.5f;
		double d = (int) f;

		f += (char) (d += f += d);
//		f += d += f += d;

		System.out.println(d);
		System.out.println(f);
	}
}

//a. Compile Time Error
//b. 30 40
//c. 30.0 40.0
//d. 30.5 40.5
//
//Ans : d
