package nov21.car;

public class Test extends Car {
	@Override
	public void display() {
		System.out.println("Car Details:" + "\nBrand: " + carBrand() + "\nModel: " + carModel() + "\nMileage: "
				+ carMileage() + " kmpl" + "\nTop Speed: " + carTopSpeed() + " km/h" + "\nYear of Manufacturing: "
				+ carYear());
	}

	public static void main(String[] args) {
		Test myCar = new Test();
		myCar.display();
	}
}
