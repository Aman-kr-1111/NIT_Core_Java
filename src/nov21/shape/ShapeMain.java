package nov21.shape;

public class ShapeMain {

	public static void main(String[] args) {

		// Rectangle object
		Shape rectangle = new Rectangle(30.3, 45.4);
		rectangle.printDetails();
		System.out.println();

		// Circle object
		Shape circle = new Circle(23.2);
		circle.printDetails();
		System.out.println();

		// Triangle object
		Shape triangle = new Triangle(146.2, 40.0);
		triangle.printDetails();
	}

}
