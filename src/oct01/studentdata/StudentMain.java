package oct01.studentdata;

public class StudentMain {

	public static void main(String[] args) {

		int roll = 101;
		String name = "Aman";
		double fees = 14000.9;

		System.out.println(Student.getStudentDetais(roll, name, fees));
	}
}
