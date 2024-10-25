package oct23.student;

public class Student {
	protected int studentId;
	protected String name;
	protected double examFee;

	public Student() {
		super();
	}

	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public double payFee(double amount) {
		return examFee - amount;
	}

	public String displayDetails() {
		return "Student [name=" + name + ",studentId=" + studentId + ",examFee=" + examFee + "]";
	}

	@Override
	public String toString() {
		return displayDetails();
	}
}
