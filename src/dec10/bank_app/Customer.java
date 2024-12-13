package dec10.bank_app;

public class Customer {
	private String name;
	private BankAccount account;

	public Customer(String name, BankAccount account) {
		super();
		this.name = name;
		this.account = account;
	}

	public BankAccount getAccount() {
		return account;
	}
}
