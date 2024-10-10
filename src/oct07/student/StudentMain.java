package oct07.student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentData(101, "Aman kr", 100);
		s1.calculateGrade();
		System.out.println(s1.displayDetails());
	}

}
