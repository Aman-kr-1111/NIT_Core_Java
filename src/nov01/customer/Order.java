package nov01.customer;

public class Order {
	private String orderId;
	private String productName;

	public Order(String orderId, String productName) {
		super();
		this.orderId = orderId;
		this.productName = productName;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";

	}

}
