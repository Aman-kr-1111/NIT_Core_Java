package nov08.book;

public class LibraryManagerMain {

	public static void main(String[] args) {
		BookBorrowing bk1 = new BookBorrowing("", "Alice");
		borrowItem(bk1);

		MagazineBorrowing mz1 = new MagazineBorrowing("Time", "Charlie");
		LibraryManagerMain mr = new LibraryManagerMain();
		mr.borrowItem(mz1);

		DVDBorrowing dvd1 = new DVDBorrowing("Inception", "Bob");
		mr.borrowItem(dvd1);
	}

	public static void borrowItem(BookBorrowing borrowing) {
		if (borrowing.getBookTitle().isEmpty()) {
			System.err.println("Error: Book title cannot be empty.");
		} else {
			System.out.println(borrowing.getBorrowerName() + " borrowed the book: " + borrowing.getBookTitle());
		}
	}

	public void borrowItem(DVDBorrowing borrowing) {
		System.out.println(borrowing.getBorrowerName() + " borrowed the DVD: " + borrowing.getDvdTitle());
	}

	public void borrowItem(MagazineBorrowing borrowing) {
		System.out.println(borrowing.getBorrowerName() + " borrowed the magazine: " + borrowing.getMagazineTitle());
	}
}
