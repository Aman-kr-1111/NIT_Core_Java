package nov08.book;

public class DVDBorrowing {
	private String dvdTitle;
	private String borrowerName;

	public DVDBorrowing(String dvdTitle, String borrowerName) {
		super();
		this.dvdTitle = dvdTitle;
		this.borrowerName = borrowerName;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

}
