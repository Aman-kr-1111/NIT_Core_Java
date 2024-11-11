package nov09.test.set_B.library_system;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book(1, "Poem", "ABC");
		Member m1 = new Member(101, "XYZ", "ST", b1);

//		System.out.println(b1);
		System.out.println(m1);
	}

}
