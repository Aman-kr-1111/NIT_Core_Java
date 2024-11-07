//Circle and Cylinder Shape Calculation Program======================================================
//
//You are tasked with developing a software application for a company that designs custom containers.The company needs to calculate the surface area of circular bases and the volumes of cylindrical containers to estimate materials and costs.To achieve this,you will create a Java program with the following requirements:
//
//Class Circle is given to you.----------------------------
//
//Add below details to the class
//
//1. Instance variables:
//
//radius:double.
//
//2. Create a no constructor that assigns default values to instance variables.
//
//3. Create parameterized constructor that accepts radius.
//
//4. Create below methods,
//
//Method name:getArea
//
//Return type:double
//
//This method should return the area of the circle.Return-1 if radius is negative.
//
//Create a sub
//class of
//Circle with
//name Cylinder-----------------------------------------------
//
//Add below
//details to the class
//
//1.
//Instance variables:
//
//height:double.
//
//2.
//Create a
//No constructor
//that assigns default
//values to
//instance variables.
//
//3.
//Create parameterized
//constructor that
//accepts radius, height.
//
//4.
//Create below methods,
//
//Method name:
//getVolume
//
//Return type:
//double
//
//This
//method should return
//the volume
//of the cylinder.Return-1 if
//height is
//negative.
//
//An ELC
//
//class ShapeTester
//is given
//to you
//with a
//main method.Use this
//
//class to
//test your
//
//Condition:-----------if
//any numeric
//value is
//zero or
//negative then print"Error Invalid Input".
//
//TEST CASE 1:-------------
//sample input:
//When your
//reading values for
//Circle Class
//OR Cylinder
//
//class then
//make sure if
//any numeric
//value is<=0
//then print"Error Invalid Input".
//
//sample output:
//Error Invalid
//Input
//
//TEST CASE 2:-------------
//sample input:
//Cylinder c = new Cylinder(5, 5);
//sample output:Volume=392.5 Area=78.5

package oct24.shape;

public class Circle {
	protected double radius;

	public Circle(double radius) {
		super();
		if (radius <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}
