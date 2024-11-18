package nov18.shape;

public class ShapeMain {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Shape shape = Shape.randshape();
			shape.draw();
			shape.erase();
			System.out.println();
		}
	}

}
