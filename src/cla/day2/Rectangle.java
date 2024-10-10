//Write a program to find out the area of Rectangle where length and  breadth of the Rectangle must be taken from user from command line argument..

package cla.day2;

public class Rectangle {

	public static void main(String[] args) {

		double length = Double.parseDouble(args[0]);
		double breadth = Double.parseDouble(args[1]);

		double area = length * breadth;
		System.out.println("Area of rectangle : " + area);
	}
}
