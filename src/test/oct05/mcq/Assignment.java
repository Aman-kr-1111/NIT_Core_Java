package test.oct05.mcq;

public class Assignment {
	public static void main(String[] args) {
		int a, b, c;
		b = 10;
		a = b = c = 20;
		System.out.println(a);
	}
}

//(a) The program will fail to compile since the compiler will report that the variable c in the multiple assignment statement a = b = c = 20; has not been initialized.

//(b) The program will fail to compile, because the multiple assignment statement
//		a = b = c = 20; is illegal.

//(c) The code will compile and print 10, when run.

//(d) The code will compile and print 20, when run.

//Ans : d
