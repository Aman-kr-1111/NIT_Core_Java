package nov20.book;

public abstract class Book {
	protected String title;

	public abstract void setTitle(String title);

	public String getTitle() {
		return "The title of my book is : " + title;
	}

}
