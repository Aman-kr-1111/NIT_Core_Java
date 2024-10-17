//Create a class Rectangle
//
//Attributes:
//names	datatypes--------------------width double-privatre
// height double-
//private
//
//Implement an
//instance block
//that initializes
//the instance
//variables to 0.
//
//Implement a
//parameterized constructor
//that sets
//the instance
//variables width
//and height.
//
//Methods:
//
//both the method is[public and return
//type is double]
//
//Implement an
//instance method
//
//getArea() that returns the area of the rectangle. 
//
//Implement another instance
//
//method getPerimeter()that returns the perimeter of the rectangle. 
//
//Take one Main class ELC class which is having main method,
//Create a Rectangle object with width 5 and height 10 and call
//the getArea() and getPerimeter() methods on it.
//
//
//Test Cases -1 :
//------------------
//Valid Case: width = 5, height = 10
//
//Sample Input: width = 5, height = 10
//
//Expected Output:
//
//Area: 50.0
//Perimeter: 30.0
//
//Test Cases -2 :
//------------------
//Invalid Case: Negative width
//
//Sample Input: width = -5, height = 10
//
//Expected Output:
//
//Error: Width and height must be non-negative.
//

package oct16.rectangle;

public class Rectangle {
	private double width;
	private double height;
	{
		width = 0;
		height = 0;
	}

	public Rectangle(double width, double height) {
		super();
		if (width < 0) {
			System.err.println("Error: Width and height must be non-negative.");
			System.exit(0);
		}
		if (height < 0) {
			System.err.println("Error: Width and height must be non-negative.");
			System.exit(0);
		}

		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}

}
