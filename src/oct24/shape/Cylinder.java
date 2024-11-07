package oct24.shape;

public class Cylinder extends Circle {
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		if (height <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.height = height;
	}

	public double getVolume() {
		return super.getArea() * height;
	}

}
