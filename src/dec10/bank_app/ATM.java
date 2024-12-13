package dec10.bank_app;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount ba1 = new BankAccount(12345, 2000);
		BankAccount ba2 = new BankAccount(99999, 5000);

		Customer cust1 = new Customer("Aman kr", ba2);
		Customer cust2 = new Customer("Akash kr", ba1);

		int option = 0;
		while (option != 6) {
			try {
				System.out.println(
						"Select an option !!!\n1. Deposit\n2. Withdraw\n3. Transfer\n4. Loan Application\n5. Check Balance\n6. Exit\n");

				System.out.print("Enter your option: ");
				option = scanner.nextInt();

				switch (option) {
				case 1 -> {
					System.out.print("Enter deposit amount: ");
					int amount = scanner.nextInt();
					ba1.deposit(amount);
				}
				case 2 -> {
					System.out.print("Enter withdraw amount: ");
					int amount = scanner.nextInt();
					ba1.withdraw(amount);
				}
				case 3 -> {
					System.out.print("Enter transfer amount: ");
					int amount = scanner.nextInt();
					ba1.transfer(amount, ba2);
				}
				case 4 -> {
					System.out.print("Enter loan amount: ");
					int amount = scanner.nextInt();
					ba1.applyForLoan(amount);
				}
				case 5 -> {
					System.out.println("Your current balance: " + ba1.getBalance());
				}
				case 6 -> {
					System.out.println("Thnx for exist :)");
					System.exit(0);
				}
				default -> System.out.println("Unexpected value: ");
				}
			} catch (InvalidAmountException e) {
				System.out.println(e.getMessage());
			} catch (InsufficientFundsException e) {
				System.out.println(e.getMessage());
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			}

		}
		scanner.close();
	}

}
