package nov21.shape;

public class Circle extends Shape {
	private double radius;
	private final double PI = 3.14;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public void printDetails() {

		System.out.println("Type = Circle\nRadius = " + radius + "\nArea = " + getArea());

	}
}
