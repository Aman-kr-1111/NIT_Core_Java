package nov18.hospital;

public class Doctor extends HospitalStaff {
	private String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}

	@Override
	public void work() {
		System.out.println(super.getName() + ", " + super.getRole() + " with specialization in " + specialization
				+ " is treating patients.");
	}

}
