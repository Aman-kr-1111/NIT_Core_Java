package oct24.studentpercent;

public class StudentMain {

	public static void main(String[] args) {
		ScienceStudent sciStu1 = new ScienceStudent("Anjali", 101, 85, 90, 80);
		sciStu1.displayDetails();
		System.out.println("Percentage: " + sciStu1.calculatePercentage() + "%");
		System.out.println();

		ArtsStudent artsStu1 = new ArtsStudent("Aryan", 102, 75, 80, 85);
		artsStu1.displayDetails();
		System.out.println("Percentage: " + artsStu1.calculatePercentage() + "%");
	}
}
