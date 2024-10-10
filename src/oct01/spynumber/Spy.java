//Write a program to check accept a number and check whether it is a'Spy Number'or not.(A number is spy if the sum of its digits equals the product of its digits.)Example:Sample Input:1124 Sum of the digits=1+1+2+4=8 Product of the digits=1*1*2*4=8 Explanation:Create a BLC(Business Logic Class)
//class called
//Calculate which
//contains a
//
//static method checkSpyNum ()
//
//Name of the Method 		: checkSpyNum ()
//Parameter of the Method		: one parameter of type integer
//Return type of the Method	: void
//Access modifier of the Method	:
//
//public
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
//static method checkSpyNum ()
//of Calculate class.

package oct01.spynumber;

public class Spy {
	public static void checkSpyNum(int num) {
		int sum = 0, product = 1, store_num = num;

		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			product *= rem;
			num /= 10;
		}

		System.out.println(store_num + " is " + (sum == product ? "a " : "not a ") + "spy number");
	}
}
