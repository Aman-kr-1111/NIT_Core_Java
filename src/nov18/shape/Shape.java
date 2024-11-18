//Question-1--------------Create a BLC
//class Named
//as Shape
//and it
//have three
//sub classes
//named as Circle,
//Triangle and
//Squar
//e for each
//
//class have
//two methods
//called as
//
//draw()
//
//and erase()
//
//For Shape class
//
//Methods:
//public static Shape randshape()
//No Argument constructor
//randshape(): Using switch ((int) (Math.random()*3))
//case 0: create an object for Circle Object using return
//case 1: create an object for Square Object using return
//case 2: create an object for Triangle Object using return
//default: Print as default message
//finally return an object for Shape class
//Use this class to test your solution's class and methods in main method
//
//For Shape class
//Methods: In draw():void and erase():void and No argument constructor
//draw(): print "shape draw"
//erase(): print "Shape erase"
//For Circle class sub class of Shape class
//Methods: In draw():void and erase():void and No argument constructor
//Override:
//draw() method print "Circle draw" and erase() method print "Circle erase"
//
//For Triangle class sub class of Shape class
//
//Take No argument constructor
//
//Methods: 
//
//In draw():void 
// erase():void 
//Override:
//draw() method print "Triangle draw" and erase() method print "Triangle erase"
//
//
//For Square class sub class of Shape class
//
//Take No argument constructor
//
//Methods: 
// draw():void 
// erase():void 
// 
//Override:
//draw() method print "Square draw" and erase() method print "Square erase"
//
//
//
//Create Main class(ELC Class) named as ShapeDemo and havinf main method and call the method and execute it.
//
//Test Cases -1 :
//-------------------
//Valid Case: Random Shape Generation
//
//Sample Input: [No input needed]
//Expected Output (example run, actual output will vary due to randomness):
//
//Triangle draw
//Triangle erase
//
//Square draw
//Square erase
//
//Circle draw
//Circle erase
//
//Circle draw
//Circle erase

package nov18.shape;

public class Shape {

	public static Shape randshape() {

		switch ((int) (Math.random() * 3)) {
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		default:
			System.out.println("Default case");
			return new Shape();
		}
	}

	public void draw() {
		System.out.println("Shape draw");
	}

	public void erase() {
		System.out.println("Shape erase");
	}
}
