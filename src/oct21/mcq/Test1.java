package oct21.mcq;

class Test1 {
	int a = 10;

	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println("Non static variable" + " accessed using instance" + " of a class");
		System.out.println("Non Static variable " + t.a);
	}
}