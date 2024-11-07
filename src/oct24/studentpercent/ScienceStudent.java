package oct24.studentpercent;

public class ScienceStudent extends Student {
	private int physicsMarks;
	private int chemstryMarks;
	private int mathMarks;

	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemstryMarks, int mathMarks) {
		super(name, rollNumber);
		if (physicsMarks <= 0 || chemstryMarks <= 0 || mathMarks <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.physicsMarks = physicsMarks;
		this.chemstryMarks = chemstryMarks;
		this.mathMarks = mathMarks;
	}

	@Override
	public void displayDetails() {
		System.out.println("Science Student Details!!!\nName: " + super.name + "                \nRoll Number: "
				+ super.rollNumber + "\nPhysics Marks: " + physicsMarks + "\nChemistry Marks: " + chemstryMarks
				+ "\nMath Marks: " + mathMarks);
	}

	@Override
	public double calculatePercentage() {
		return (physicsMarks + chemstryMarks + mathMarks) / 3D;
	}
}
