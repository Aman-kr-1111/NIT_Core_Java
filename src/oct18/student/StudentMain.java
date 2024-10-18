package oct18.student;

public class StudentMain {

	public static void main(String[] args) {
		// Test case - 1
		Student st1 = new Student("Aman kr", 101, "Java", 30_000);
		st1.setAverage(76);

		System.out.println("Grade for average " + st1.getAverage() + " : " + st1.calculateGrade());

		// Test case - 2
//		Student st2 = new Student("Aman kr", 101, "Java", 30_000);
//		st2.setAverage(58);
//
//		System.out.println("Grade for average " + st2.getAverage() + " : " + st2.calculateGrade());

//		// Test case - 3
//		Student st3 = new Student("Aman kr", 101, "Java", 30_000);
//		st3.setAverage(-10);

	}
}
