package dec10.bank_app;

public class BankAccount implements Bank {
	private long accountNumber;
	private double balance;

	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid amount input\n");
		}
		this.balance += amount;
		System.out.println(amount + " successfully deposit.");
		System.out.println("Your current balance: " + this.getBalance());
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid amount input\n");
		} else if (amount > this.balance) {

			throw new InsufficientFundsException("Insufficient fund\n");
		}
		this.balance -= amount;
		System.out.println(amount + " successfully withdraw.");
		System.out.println("Your current balance: " + this.getBalance());
	}

	@Override
	public void transfer(double amount, BankAccount toAccount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid amount input\n");
		} else if (toAccount == null || this.accountNumber == toAccount.accountNumber) {

			throw new AccountNotFoundException("Account not found\n");
		} else if (this.balance <= 0 || this.balance < amount) {

			throw new InsufficientFundsException("Insufficient fund\n");
		}

		this.balance -= amount;
		System.out.println("Rs. " + amount + " successfully transfer. to accno :" + toAccount.accountNumber);
		System.out.println("Your current balance: " + this.getBalance());

	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Invalid amount input\n");
		} else if (this.balance <= 50_000 || amount > 50_000) {

			throw new LoanNotAllowedException("Balance must be more than 50_000 and loan amount less than 50_000\n");
		}
		System.out.println("Loan approved");

		this.balance += amount;
		System.out.println("Your current balance: " + this.getBalance());
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

}
