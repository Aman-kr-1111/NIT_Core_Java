package oct15.inventory;

public class InventoryMain {

	public static void main(String[] args) {

		InventoryItem i1 = new InventoryItem("Apples", 10, 15);

		System.out.println("Total value of " + i1.getItemName() + " in stock : " + i1.calculateTotalValue());

//		InventoryItem i2 = new InventoryItem("Oranges", -5.0, 15);

//		InventoryItem i3 = new InventoryItem("Bananas", 5.0, -10);

//		InventoryItem i4 = new InventoryItem("", 8.0, 10);

	}

}
