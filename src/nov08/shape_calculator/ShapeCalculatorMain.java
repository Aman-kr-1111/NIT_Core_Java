package nov08.shape_calculator;

public class ShapeCalculatorMain {

	public static void main(String[] args) {

		ShapeCalculator sc1 = new ShapeCalculator();

		double radius = 7.0;
		System.out.println("Area of circle with radius " + radius + ": " + sc1.calculateArea(radius));

		int sideLength = -5;
		sc1.calculateArea(sideLength);

		int length = -5, width = 10;
		sc1.calculateArea(length, width);
	}

}
