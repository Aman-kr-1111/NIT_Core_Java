package dec11.shop_app;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void decreaseQuantity(int amount) throws InsufficientQuantityException {
		if (amount <= 0 || amount > this.quantity) {
			throw new InsufficientQuantityException("Insufficient quantity");
		}

		this.quantity -= amount;
	}

}
