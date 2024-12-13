package dec10.bank_app;

public class LoanNotAllowedException extends RuntimeException {
	public LoanNotAllowedException(String message) {
		super(message);

	}
}
