package oct24.vehicle;

public class Car extends Vehicle {
	private int numberOfDorrs;

	public Car(String make, String model, int year, int numberOfDorrs) {
		super(make, model, year);
		if (numberOfDorrs <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.numberOfDorrs = numberOfDorrs;
	}

	@Override
	public void displayDetails() {
		System.out.println("Car Details!!!\nMake: " + super.make + "\nModel: " + super.model + "\nYear: " + super.year
				+ "\nNumber of Doors: " + numberOfDorrs + "\n");
	}

}
