//Design a inventory system for a retail store:
//
//InventoryItem Class:[BLC Class]
//
//Create an InventoryItem
//class with
//the following
//
//Attributes:--------------
//Names dataType--------- -----------
//itemName String pricePerUnit
//double quantityInStock
//int 
//
//Implement
//a constructor
//that takes
//parameters to
//initialize the
//attributes of
//the InventoryItem
//object.
//
//		Provide getter
//and setter methods for
//each attribute
//to ensure
//proper encapsulation.
//
//Method:-------------MethodName:calculateTotalValue()
//Return Type		:double
//Access Modifier 	:
//
//public
//
//This method
//should calculate and return
//the total
//value of
//the inventory
//item in stock,
//which is
//the product
//of the
//price per
//unit and
//the quantity
//in stock.
//
//Take a InventoryMain class(ELC Class)
//which is
//having main
//method to
//Create instances
//of the InventoryItem class,
//perform calculations, and
//display relevant
//information such
//as the
//total value
//of the
//item in
//stock and
//whether a
//reorder is
//required.
//
//Taste Case-1-----------------
//Sample Input:
//
//Item Name:"Apples"
//Price per Unit:10
//Quantity in Stock:15
//
//Expected Output:
//Total Value
//of Apples
//in Stock:150
//
//Test Case 2:---------------
//Sample Input:
//
//Item Name:"Oranges"
//Price per Unit:-5.0
//Quantity in Stock:20
//
//Expected Output:
//Error message
//indicating invalid
//price.
//
//Test Case 3:---------------
//Sample Input:
//
//Item Name:"Bananas"
//Price per Unit:5.0
//Quantity in Stock:-10
//
//Expected Output:
//Error message
//indicating invalid
//quantity.
//
//Test Case 4:---------------
//sample input:
//
//Item Name:""
//Price per Unit:8.0
//Quantity in Stock:10
//
//Expected Output:
//Error message
//indicating invalid
//item name.

package oct15.inventory;

public class InventoryItem {
	private String itemName;
	private double pricePerUnit;
	private int quantityInStock;

	public InventoryItem() {
		super();
	}

	public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
		super();
		setItemName(itemName);
		setPricePerUnit(pricePerUnit);
		setQuantityInStock(quantityInStock);
	}

	public String getItemName() {
		return itemName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setItemName(String itemName) {
		if (itemName.isEmpty()) {
			System.err.println("Error: Invalid item name.");
			System.exit(0);
		}
		this.itemName = itemName;
	}

	public void setPricePerUnit(double pricePerUnit) {
		if (pricePerUnit <= 0) {
			System.err.println("Error: Invalid price.");
			System.exit(0);
		}
		this.pricePerUnit = pricePerUnit;
	}

	public void setQuantityInStock(int quantityInStock) {
		if (quantityInStock < 0) {
			System.err.println("Error: Invalid quantity.");
			System.exit(0);
		}
		this.quantityInStock = quantityInStock;
	}

	public double calculateTotalValue() {
		double totalVal = 0;
		totalVal = pricePerUnit * quantityInStock;
		return totalVal;
	}
}
