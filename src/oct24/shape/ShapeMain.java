package oct24.shape;

public class ShapeMain {

	public static void main(String[] args) {
		Circle cir1 = new Circle(5);
		System.out.println("Circle Area : " + cir1.getArea() + "\n");

		Cylinder cyn1 = new Cylinder(5, 5);
		System.out.println("Cylinder Volume : " + cyn1.getVolume());
		System.out.println("Circle Area : " + cyn1.getArea());
	}
}
