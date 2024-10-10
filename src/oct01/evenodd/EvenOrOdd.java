//Write a program to check whether a number is even or odd
//
//Explanation:Create a BLC(Business Logic Class)
//class EvenOrOdd
//which contains a
//
//static method isEven()
//
//Name of the Method 		: isEven()
//Parameter of the Method		: one parameter of type integer
//Return type of the Method	: boolean
//Access modifier of the Method	:
//
//public
//
//Write the
//logic inside
//the method
//
//isEven () to check number is even or odd
//
//Create another class Test in the same package which is ELC class (contains main method) to test the application. Don’t create the Object in the Test class, call the static method isEven()
//of EvenOrOdd class  to return number is even or odd and print the result in main method.
//
//Note :- Both the classes must be declared with public access modifier

package oct01.evenodd;

public class EvenOrOdd {

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
