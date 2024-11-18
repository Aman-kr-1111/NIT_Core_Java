package nov18.payment;

public class PayPalPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment");
	}
}
