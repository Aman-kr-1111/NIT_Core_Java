package dec11.shop_app;

public class ShoppingCart {
	private Product[] cartItems;
	private int itemCount;

	public ShoppingCart(int capacity) {
		super();
		this.cartItems = new Product[capacity];
	}

	public void addToCart(Product pd, int quantity) throws InsufficientQuantityException, InvalidProductException {

		if (quantity > this.itemCount) {
			throw new InsufficientQuantityException("Insufficient quantity");
		} else if (pd == null) {
			throw new InvalidProductException("product not found");
		}

		while (quantity > 0) {
			cartItems[this.itemCount++] = pd;
			quantity--;
		}
		pd.decreaseQuantity(quantity);
	}

	public double calculateTotal() {
		int bill = 0;
		for (Product product : cartItems) {

			if (product != null) {
				bill += product.getPrice() * product.getQuantity();
			}
		}
		return bill;
	}

}
