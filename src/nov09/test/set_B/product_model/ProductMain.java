package nov09.test.set_B.product_model;

public class ProductMain {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter " + i + " product details!!!");
			Product p = Product.getProductObject();
			System.out.println(p);
			System.out.println();
		}
	}

}
