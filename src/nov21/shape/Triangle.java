package nov21.shape;

public class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Triangle\nBase = " + base + "\nHeight = " + height + "\nArea = " + getArea());
	}
}
