package oct16.guessoutput;

class Laptop {
	void access() {
		System.out.println("Copy java soft copies... ");
	}
}

class Faculty {
	static Laptop password = new Laptop();
}

public class Student {
	public static void main(String[] args) {
		Faculty.password.access();
	}
}
