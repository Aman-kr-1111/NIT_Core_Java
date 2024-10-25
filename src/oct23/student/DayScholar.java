package oct23.student;

public class DayScholar extends Student {
	protected double transportFee;

	public DayScholar() {
		super();
	}

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String displayDetails() {
		return "DayScholar [transportFee=" + transportFee + ",name=" + super.name + ",studentId=" + super.studentId
				+ ",examFee=" + super.examFee + "]";

	}

	@Override
	public double payFee(double amount) {
		double totalFee = super.examFee + transportFee;
		return totalFee - amount;
	}

}
