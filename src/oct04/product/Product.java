//Write a Program on OOPs to define Product
//class properties
//and behaviour.
//
//properties:productId:
//int productName:
//String productPrice:
//double
//
//Initialize
//these properties
//with the
//help of
//Methods using Scanner
//
//class not
//by using
//Object reference.
//
//behavior:
//
//setProductData() : public void
//getProductInfo() : public void
//

package oct04.product;

import java.util.Scanner;

public class Product {

	int productId;
	String productName;
	double productPrice;

	public void setProductData() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter produt id : ");
		productId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter produt name : ");
		productName = sc.nextLine();
		System.out.print("Enter produt price : ");
		productPrice = sc.nextDouble();
		sc.close();
	}

	public void getProductInfo() {
		System.out.println("Product id : " + productId);
		System.out.println("Product name : " + productName);
		System.out.println("Product price : " + productPrice);
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductData();
		p1.getProductInfo();
	}

}
