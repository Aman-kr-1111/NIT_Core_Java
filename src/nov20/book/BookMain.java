package nov20.book;

public class BookMain {

	public static void main(String[] args) {
		MyBook myBook = new MyBook();
		myBook.setTitle("A tale of two cities");
		System.out.println(myBook.getTitle());
	}
}
