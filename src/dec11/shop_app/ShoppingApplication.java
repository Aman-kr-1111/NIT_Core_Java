package dec11.shop_app;

public class ShoppingApplication {

	public static void main(String[] args) {
		Product pd1 = new Product(1, "Mobile", 20000, 2);

		ShoppingCart sc1 = new ShoppingCart(5);

		try {
			sc1.addToCart(pd1, 3);
		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());
		}

		System.out.println(sc1.calculateTotal());

	}

}
