//Design a Java program that models a Hospital Management System using inheritance:
//
//Create
//class HospitalStaff
//with following
//attributes
//
//declare variable:
//
//private String name;
//private int age;
//private String role;
//
//create one
//parameterized Constructor
//and initialize
//values
//
//method Name:-
//
//Work()
//Access specifier :-public
//return type:-void
//
//this method will print the role and there name with "is working massage"
//
//*create second class Doctor which will inherited with HospitalStaff
//
//declare variable:
//private String specialization;
//
// take one parameterized Constructor and initialize values
//
//// Overriding work() method for doctors
//it will print Roll and Name with this massage" with specialization in " + specialization + " is treating patient
//s."
//
//* Create Nurse class which will inherite HospitalStaff
//
//Variables :-
//private int yearsOfExperience;
//
//take  one parameterized Constructor and initialize values
//
//// Overriding work() method for nurses
//it will print massage in this format
//Role + " " + NAME + " with " + yearsOfExperience + " years of experience is taking care of patients."
//
//create class HospitalManagementSystem inside this take main method where use this class for testing
//create object for every class and check

package nov18.hospital;

public class HospitalStaff {
	private String name;
	private int age;
	private String role;

	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getRole() {
		return role;
	}

	public void work() {
		System.out.println(name + ", " + role + " is working message");
	}

}
