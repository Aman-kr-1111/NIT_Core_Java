package test.oct05.mcq;

public class ParameterPass {
	public static void main(String[] args) {
		int i = 0;
		addTwo(i++);
		System.out.println(i);
	}

	static void addTwo(int i) {
		i += 2;
	}
}

//	(a) 0
//	(b) 1
//	(c) 2
//	(d) 3
//
//	Ans : b
