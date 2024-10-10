//Write a program to find the area of the circle on the following criteria
//
//Explanation:Create a BLC(Business Logic Class)called Circle which contains a static method getArea()Name of the Method:getArea()Parameter of the Method:one parameter of type double(radius)Return type of the Method:String Access modifier of the Method:public,static
//
//Write the logic inside the method based on the following criteria a)If parameter value is 0 or Negative it should return 0 b)If parameter value is positive it should print area of circle in two digits after decimal value example(12.89)
//
//Create another
//class Test
//in the same package which
//is ELC class(contains main method)
//to test
//the application.Don’
//t create
//the Object
//in the Test class,
//call the
//
//static method getArea()
//of Circle class  and print the output in the main method.
//
//Note :- Both the classes must be declared with public access modifier
//

package oct01.areacircle;

import java.text.DecimalFormat;

public class Circle {

	public static String getArea(double radius) {
		if (radius <= 0) {
			return 0 + "";
		}

		final double PI = 3.14;
		double area = PI * radius * radius;

		DecimalFormat dFormat = new DecimalFormat("00.00");
		return dFormat.format(area) + "";
	}
}
