package dec09.car;

public class CarUserMain {

	public static void main(String[] args) {
		String actionString = "puncture";
		int num = 60;

		try {
			CarTest.stop(actionString);
			CarTest.puncture(actionString);
			CarTest.carHeat(num);
		} catch (CarStoppedException e) {
			System.out.println(e.getMessage());
		} catch (CarPunctureException e) {
			System.out.println(e.getMessage());
		} catch (CarHeatException e) {
			System.out.println(e.getMessage());
		}
	}

}
