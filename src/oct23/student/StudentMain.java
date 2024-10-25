package oct23.student;

public class StudentMain {
	public static void main(String[] args) {
//		Student stu = new Student(1, "John Smith", 25000.0);
//		System.out.println(stu);

//		DayScholar dScholar = new DayScholar(2, "Brian Lara", 25000.0, 5000.0);
//		System.out.println(dScholar);
//		double remAmt = dScholar.payFee(18000);
//		remainAmount(remAmt);

		Hosteller hosteller = new Hosteller(3, "Virat Kohli", 25000.0, 8000.0);
		System.out.println(hosteller);
		double remAmt = hosteller.payFee(33000);
		remainAmount(remAmt);
	}

	static void remainAmount(double remAmt) {
		if (remAmt < 0) {
			System.out.println("Extra amount is: " + remAmt);
		} else if (remAmt > 0) {
			System.out.println("Remaining amount to pay is: " + remAmt);
		} else {
			System.out.println("All Fees are clear");
		}
	}
}