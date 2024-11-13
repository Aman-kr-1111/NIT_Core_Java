//Question-4---------------Design a librart borrowing system
//
//Take a BookBorrowing class:
//
//Attributes:
//
//bookTitle(String)-private borrowerName(String)-private
//
//Constructor:A parameterized constructor to initialize bookTitle and borrowerName
//
//Methods:Devlop the getter method for both the attributes.
//
//Take a DVDBorrowing Class
//
//Attributes:
//
//dvdTitle(String)-private borrowerName(String)-private
//
//Take a parameterize constructor to initialize the properties
//
//Methods:Devlop the getter method for both the attributes.
//
//Take one more
//class MagazineBorrowing Class:
//
//Attributes:
//magazineTitle (String)
//borrowerName (String)
//
//Constructor: 
//Initialize both attributes
//
//Methods: 
//getMagazineTitle(), getBorrowerName()
//											
//Take a another class LibraryManager (ELC Class)
//
//Methods :
//
//static Method :borrowItem(BookBorrowing borrowing)
//Non-static Method :
//
//Non-Static Method: borrowItem(DVDBorrowing borrowing) 
// borrowItem(MagazineBorrowing borrowing)
//
//Each method should print a message indicating the borrower and the item borrowed.
//
//
//Main Class:
//
//Create instances of LibraryManager, BookBorrowing, DVDBorrowing, and MagazineBorrowing.
//
//Use the LibraryManager instance to handle the borrowing of each item.
//
//
//Taste Cases :
//----------------
//
//Case-1
//--------
//Sample Input:
//Book Title: ""
//Borrower Name: "Alice"
//
//Expected Output:
//"Error: Book title cannot be empty."
//
//case-2
//--------
//Sample Input:
//Magazine Title: "Time"
//Borrower Name: "Charlie"
//
//Expected Output:
//"Charlie borrowed the magazine: Time"

package nov08.book;

public class BookBorrowing {
	private String bookTitle;
	private String borrowerName;

	public BookBorrowing(String bookTitle, String borrowerName) {
		super();
		this.bookTitle = bookTitle;
		this.borrowerName = borrowerName;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

}
