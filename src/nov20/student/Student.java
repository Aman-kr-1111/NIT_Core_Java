package nov20.student;

public abstract class Student {
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}

	public abstract int getPercentage();

	public static int getTotalNoStudents() {

		return totalNoOfStudents;
	}
}
