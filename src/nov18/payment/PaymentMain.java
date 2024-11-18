package nov18.payment;

public class PaymentMain {

	public static void processMultiplePayments(Payment... payments) {
		for (Payment payment : payments) {
			payment.processPayment();
		}
	}

	public static void main(String[] args) {
		Payment p = new Payment();
		CreditCardPayment cp = new CreditCardPayment();
		PayPalPayment paypal = new PayPalPayment();
		BankTransferPayment bt = new BankTransferPayment();

		System.out.println("Test Case 1: Generic Payment");
		p.processPayment();

		System.out.println("\nTest Case 2: Credit Card Payment");
		cp.processPayment();

		System.out.println("\nProcessing Multiple Payments:");
		processMultiplePayments(p, cp, paypal, bt);
	}
}
