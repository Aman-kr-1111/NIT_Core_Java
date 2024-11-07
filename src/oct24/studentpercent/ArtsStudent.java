package oct24.studentpercent;

public class ArtsStudent extends Student {
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;

	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);

		if (historyMarks <= 0 || geographyMarks <= 0 || englishMarks <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}

	@Override
	public void displayDetails() {
		System.out.println("Arts Student Details!!!\nName: " + super.name + "                \nRoll Number: "
				+ super.rollNumber + "\nHistory Marks: " + historyMarks + "\nGeography Marks: " + geographyMarks
				+ "\nEnglish Marks: " + englishMarks);
	}

	@Override
	public double calculatePercentage() {
		return (historyMarks + geographyMarks + englishMarks) / 3D;
	}
}
