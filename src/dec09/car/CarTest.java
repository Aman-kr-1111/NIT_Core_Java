package dec09.car;

public class CarTest {
	public static void stop(String action) throws CarStoppedException {
		if (action.equals("stop")) {
			throw new CarStoppedException("Car stopped for some reason.");
		}
		System.out.println("Car not stalled.");
	}

	public static void puncture(String condition) throws CarPunctureException {
		if (condition.equals("puncture")) {
			throw new CarPunctureException("Car is punctured.");
		}
		System.out.println("Car not punctured.");

	}

	public static void carHeat(int temperature) throws CarHeatException {
		if (temperature > 50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		System.out.println("Car temperature normal.");
	}
}
