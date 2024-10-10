package oct03.ownthinking;

public class Life {
	String name = "Aman";
	int age = 23;

	public void happy() {
		System.out.println("I'm happy.");
	}

	public void excite() {
		System.out.println("I'm excited.");
	}

	public void enjoy() {
		System.out.println("I'm enjoying.");
	}

	public static void main(String[] args) {
		Life l1 = new Life();
		l1.happy();
		l1.excite();
		l1.enjoy();
	}

}
