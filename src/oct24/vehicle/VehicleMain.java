package oct24.vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		Car c1 = new Car("Audi", "Q8", 2021, 4);
		c1.displayDetails();

		Bike b1 = new Bike("Yamaha", "MT-07", -2020, "Sports");
		b1.displayDetails();
	}
}
