package oct23.student;

public class Hosteller extends Student {
	protected double hostelFee;

	public Hosteller() {
		super();

	}

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String displayDetails() {
		return "Hosteller[hostelFee=" + hostelFee + ", name=" + name + ", studentId=" + studentId + ", examFee="
				+ examFee + "]";
	}

	@Override
	public double payFee(double amount) {
		double totalFee = super.examFee + hostelFee;
		return totalFee - amount;
	}

}
