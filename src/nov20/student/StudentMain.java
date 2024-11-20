package nov20.student;

public class StudentMain {

	public static void main(String[] args) {
		ScienceStudent sciStu = new ScienceStudent("Aman", "12th Science", 85, 90, 80);
		printDetails(sciStu);

		// Creating HistoryStudent
		HistoryStudent hisStu = new HistoryStudent("Rohit", "12th Arts", 75, 80);
		printDetails(hisStu);

		// Total Students
		System.out.println("Total Number of Students: " + Student.getTotalNoStudents());

	}

	public static void printDetails(Student stu) {
		System.out.println((stu instanceof ScienceStudent ? "Science" : "History") + " Student Name: " + stu.studentName
				+ "\nPercentage: " + stu.getPercentage() + "%\n");
	}
}
