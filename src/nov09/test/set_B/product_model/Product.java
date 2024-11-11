package nov09.test.set_B.product_model;

import java.util.Scanner;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public static Product getProductObject() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter product id : ");
		int id = sc.nextInt();
		System.out.print("Enter product name : ");
		String name = sc.next();
		name = sc.nextLine();
		System.out.print("Enter product price : ");
		double price = sc.nextDouble();
		return new Product(id, name, price);

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}
