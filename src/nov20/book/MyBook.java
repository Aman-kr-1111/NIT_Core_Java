package nov20.book;

public class MyBook extends Book {
	@Override
	public void setTitle(String title) {
		super.title = title;
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}
}
