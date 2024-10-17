package oct16.guessoutput;

class Customer2 {
	private double bill = 1200;

	public void setBill(double bill) {
		this.bill = bill;
	}

	public double getBill() {
		return this.bill;
	}

}

public class PassByValueTest2 {
	public static void main(String[] args) {
		Customer2 c1 = new Customer2();

		updateCustomerBill(c1);
		System.out.println(c1.getBill());// 1200.0
	}

	public static void updateCustomerBill(Customer2 cust) {
		cust = new Customer2(); // Another Object
		cust.setBill(1800);
	}

}
