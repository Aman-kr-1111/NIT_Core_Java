package oct16.guessoutput;

class Customer {
	private double bill = 1200;

	public void setBill(double bill) {
		this.bill = bill;
	}

	public double getBill() {
		return this.bill;
	}
}

public class PassByValueTest {
	public static void main(String[] args) {
		Customer c1 = new Customer();

		updateCustomerBill(c1);
		System.out.println(c1.getBill());// 1800.0
	}

	public static void updateCustomerBill(Customer cust) {
		cust.setBill(1800);
	}
}
