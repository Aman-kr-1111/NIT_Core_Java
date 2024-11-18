package nov18.hospital;

public class HospitalMain {

	public static void main(String[] args) {
		HospitalStaff staff = new HospitalStaff("John Doe", 35, "Receptionist");
		staff.work();

		Doctor doctor = new Doctor("Dr. Smith", 45, "Doctor", "Cardiology");
		doctor.work();

		Nurse nurse = new Nurse("Nina", 30, "Nurse", 10);
		nurse.work();
	}

}
