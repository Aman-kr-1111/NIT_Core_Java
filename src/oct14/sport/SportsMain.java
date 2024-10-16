package oct14.sport;

public class SportsMain {

	public static void main(String[] args) {

		Sports sp1 = new Sports("Football", 11);
		sp1.displayInfo();
		Sports sp2 = new Sports("Cricket", 11, "   ");
		sp2.displayInfo();
	}

}
