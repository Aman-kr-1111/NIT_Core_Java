package oct24.vehicle;

public class Bike extends Vehicle {
	private String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}

	@Override
	public void displayDetails() {
		System.out.println("Bike Details!!!\nMake: " + super.make + "\nModel: " + super.model + "\nYear: " + super.year
				+ "\nType: " + type + "\n");
	}
}
