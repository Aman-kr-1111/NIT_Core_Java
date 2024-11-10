package test.oct05.mcq;

public class Test19 {
	public static void main(String[] argv) {
		int a = 1, b = 2, c = 4, d;
		d = --c + ++a - --c + ++b;// 3+2-2+3=6
		c = d;// 6
		d = --d + ++c;// 5+7
		System.out.println(d);// 12
	}
}

//a. 9
//b. 10
//c. 11
//d. 12

//Ans : d