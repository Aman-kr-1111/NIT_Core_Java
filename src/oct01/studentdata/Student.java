//Write a program to print the Student data in the given format

//Explanation:Create a BLC(Business Logic Class)
//class Student
//which contains a
//
//static method getStudentDetails()
//
//Name of the Method 		:	getStudentDetails()
//Parameter of the Method		:	3 parameters roll ,name and fees of type int , String and double respectively.
//Return type of the Method	:	String
//Access modifier of the Method	:	public and
//
//static
//
//Create another
//
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
//static method getStudentDetails() which should print the Student data in the following format
//[ Roll is :101, Name is :Ravi, Fees is :14000.9]
//
//Note :- Both the classes must be declared with
//
//public access modifier

package oct01.studentdata;

public class Student {
	public static String getStudentDetais(int roll, String name, double fees) {

		return "[ Roll is : " + roll + ", Name is : " + name + ", Fees is : " + fees + "]";
	}
}
