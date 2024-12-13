package dec10.bank_app;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}
