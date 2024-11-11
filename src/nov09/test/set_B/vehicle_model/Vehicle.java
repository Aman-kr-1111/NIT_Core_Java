package nov09.test.set_B.vehicle_model;

public class Vehicle {
	private int maxSpeed;
	private String vehicleName;
	private String fuelType;

	public Vehicle() {
		super();
		this.maxSpeed = 0;
		this.vehicleName = null;
		this.fuelType = null;
	}

	public Vehicle(int maxSpeed, String vehicleName) {
		super();
		if (maxSpeed <= 0) {
			System.err.println("Error: Maximum speed must be positive.");
			System.exit(0);
		}
		this.maxSpeed = maxSpeed;
		this.vehicleName = vehicleName;
	}

	public Vehicle(int maxSpeed, String vehicleName, String fuelType) {
		super();
		if (maxSpeed <= 0) {
			System.err.println("Error: Maximum speed must be positive.");
			System.exit(0);
		}
		this.maxSpeed = maxSpeed;
		this.vehicleName = vehicleName;
		this.fuelType = fuelType;
	}

	public void displayInfo() {
		System.out.println(
				"Vehicle [maxSpeed=" + maxSpeed + ", vehicleName=" + vehicleName + ", fuelType=" + fuelType + "]");
	}

}
