//write a java program to calculate the total surface area of a cylinder?
//Formula-2*pi*r(r+h).

package mathprogram.day1;

public class TSAOfCylinder {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 2.5;
		double height = 12;

		double TSA = 2 * PI * radius * (radius + height);
		System.out.println("Total surface area : " + TSA);
	}

}
