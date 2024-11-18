package nov18.hospital;

public class Nurse extends HospitalStaff {
	private int yearsOfExperience;

	public Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void work() {
		System.out.println(getRole() + ", " + getName() + " with " + yearsOfExperience
				+ " years of experience is taking care of patients.");
	}
}
