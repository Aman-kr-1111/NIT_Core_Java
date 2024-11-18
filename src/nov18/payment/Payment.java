//Superclass Payment:
//
//Method to process a payment:
//
//Method Name: processPayment
//Access Modifier: public
//Return Type: void
//
//Task: Print a generic payment processing message (e.g., "Processing payment").
//
//
//Subclass CreditCardPayment:
//
//Override processPayment method to print a credit card-specific message:
//
//Method Name: processPayment
//Access Modifier: public
//Return Type: void
//
//Task: Print a message for credit card payment (e.g., "Processing credit card payment").
//
//Subclass PayPalPayment:
//
//Override processPayment method to print a PayPal-specific message:
//
//Method Name: processPayment
//Access Modifier: public
//Return Type: void
// 
//Task: Print a message for PayPal payment (e.g., "Processing PayPal payment").
//
//
//Subclass BankTransferPayment:
//
//Override processPayment method to print a bank transfer-specific message:
//
//Method Name: processPayment
//Access Modifier: public
//Return Type: void
//
//Task: Print a message for bank transfer payment (e.g., "Processing bank transfer payment").
//
//
//Create a Main Class in which take main method and take one static method
//
//Method :
//
//Method to process multiple payments in a single transaction:
//
//Method Name: processMultiplePayments
//Access Modifier: public
//Return Type: void
//Arguments: Payment... payments
//
//Task: Loop through each payment and call the processPayment method.
//
//Create instances of Payment, CreditCardPayment, PayPalPayment, and BankTransferPayment.
//Use polymorphism to call the processPayment method on each instance.
//
//
//
//Test Case 1: 
//--------------
//Generic Payment
//Sample Input:
//if you are calling processPayment() of generic Payment
//
//Expected Output :
//Processing payment
//
//Test Case 2: Credit Card Payment
//---------------
//Sample Input:
//if you are calling processPayment() of Credit Card Payment
//
//Expected Output :
//Credit Card  payment done.

package nov18.payment;

public class Payment {
	public void processPayment() {
		System.out.println("Processing payment");
	}
}
