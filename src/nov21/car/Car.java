package nov21.car;

public abstract class Car {
	String brand;
	String model;
	int mileage;
	int top_speed;
	int yearOfManufacturing;

	String carBrand() {
		return this.brand = "Tesla";
	}

	String carModel() {
		return this.model = "Model S";
	}

	int carMileage() {
		return this.mileage = 400;
	}

	int carTopSpeed() {
		return this.top_speed = 250;
	}

	int carYear() {
		return this.yearOfManufacturing = 2023;
	}

	public abstract void display();

}
