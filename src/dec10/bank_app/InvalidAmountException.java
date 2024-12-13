package dec10.bank_app;

public class InvalidAmountException extends RuntimeException {
	public InvalidAmountException(String message) {
		super(message);
	}

}
