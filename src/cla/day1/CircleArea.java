//Write a program to find out the area of circle by taking the value from Command line arguments

package cla.day1;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = Double.parseDouble(args[0]);

		double area = PI * radius * radius;
		System.out.println("Area of circle : " + area);
	}
}