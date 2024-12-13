package dec10.bank_app;

public interface Bank {
	void deposit(double amount) throws InvalidAmountException;

	void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;

	void transfer(double amount, BankAccount toAccount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;

	void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;

	double getBalance();
}
