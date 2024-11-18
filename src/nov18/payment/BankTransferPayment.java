package nov18.payment;

public class BankTransferPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Processing bank transfer payment");
	}
}
