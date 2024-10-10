//A BLC (Business Logic Class) called Student is given to you.
//Instance Variables: 
//studentId :private-int
//studentName : private-String
//marks: private-int
//grade: private-char
//
//method : calculateGrade():public:void
//
//Create a method public void setStudentData() with the parameters: studentId, studentName, marks.
//
//Note that grade is not set through method because it is a calculated value.
//
//Methods :
//displayDetails(): This method should return a String with  the details of the student in the following format:
//Student [name=John Smith, studentId=123, marks=95, grade=A] 
//
//calculateGrade(): This is a public method that calculates the grade based on the marks that is set. 
//If marks is above 90, grade is set to A. 
//If marks is between 81 and 90, grade is set to B, 
//if marks is between 71 and 80, grade is set to C, 
//if marks is between 61 and 70, grade is set to D, 
//if marks is less than 61, grade is set to E.
//Use this method when you need to set or reset grade.
//
//An ELC(Executable Logic class) Tester with main method is given to you to test your code.

package oct07.student;

public class Student {
	private int studentId;
	private String studentName;
	private int marks;
	private char grade;

	public void setStudentData(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public String displayDetails() {
		return "[name=" + studentName + ", studentId=" + studentId + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public void calculateGrade() {
		if (marks > 90 && marks <= 100) {
			grade = 'A';
		} else if (marks > 80 && marks <= 90) {
			grade = 'B';
		} else if (marks > 70 && marks <= 80) {
			grade = 'C';
		} else if (marks > 60 && marks <= 70) {
			grade = 'D';
		} else if (marks > 0 && marks <= 60) {
			grade = 'E';
		}
	}
}
