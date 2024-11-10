package nov01.customer;

public class ShopingMain {

	public static void main(String[] args) {
		Order order = new Order("123456", "Laptop");
		Customer customer = new Customer("James", "James@example.com", order);
		System.out.println(customer);

	}

}
