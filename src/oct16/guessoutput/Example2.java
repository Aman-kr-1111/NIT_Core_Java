package oct16.guessoutput;

public class Example2 {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		Example2 e1 = new Example2();
		Example2 e2 = new Example2();
		System.out.println(e1.a + "..." + e1.b);// 10...20
		System.out.println(e2.a + "..." + e2.b);// 10...20
		e1.a = 50;
		e2.b = 60;
		System.out.println(e2.a + "..." + e2.b);// 10...60
		System.out.println(e2.a + "..." + e2.b);// 10...60
	}
}
