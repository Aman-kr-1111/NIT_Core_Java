package test.oct05.mcq;

public class Test22 {
	public static void main(String[] argv) {
		float f = 2.5f;
		double d = 1.5;
		System.out.println(++f + d++ + ++f + ++d);// 3.5f + 1.5 + 4.5f + 3.5 = 13.0
	}
}

//a. Compile time error
//b. 13.0
//c. 13
//d. 13.5
//
//Ans : b
