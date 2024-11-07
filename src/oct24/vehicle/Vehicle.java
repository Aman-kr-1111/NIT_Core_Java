//Define the base
//class Vehicle-------------------------------
//
//Attributes:make:
//String model:
//String year:
//int
//
//Constructor:
//
//Vehicle(String make, String model, int year): Constructor to initialize the attributes.
//
//Methods:
//
//void displayDetails(): Method to display the details of the vehicle.
//
//
//
//Define the subclass Car Inherits from Vehicle
//---------------------------------------------
//
//Attributes:
//numberOfDoors: int
//
//Constructor:
//
//Car(String make, String model, int year, int numberOfDoors): Constructor to initialize the attributes.
//
//Methods:
//
//void displayDetails(): Method to display the details of the car, overriding the method from Vehicle.
//
//
//
//Define the subclass Bike Inherits from Vehicle
//----------------------------------------------
//
//Attribute:
//type: String
//
//Constructor:
//
//Bike(String make, String model, int year, String type): Constructor to initialize the attributes.
//
//Methods:
//
//void displayDetails(): Method to display the details of the bike, overriding the method from Vehicle.
//
//
//
//Create Test class
//-----------------
//-> create main method
//-> in main method create Car object and Bick object.
//-> Print the details of Car class and Bick class by calling displayDetails() methods of both class.
//
//
//Condition :
//-----------
//if any numeric value is zero or negative then print "Error Invalid Input".
//
//
//TEST CASE 1 :
//-------------
//sample input  : When your reading values for Vehicle class OR Car class OR Bike class then make sure if any numeric value is <=0 then print "Error Invalid Input".
//                
//sample output : Error Invalid Input
//
//
//
//TEST CASE 2 :
//-------------
//sample input : Car car = new Car("Audi", "Q8", 2021, 4);
//               System.out.println("Car Details:");
//               car.displayDetails();
//
//               Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
//               System.out.println("\nBike Details:");
//               bike.displayDetails();
//
//
//sample output : 
//                Car Details:
//                Make: Audi
//                Model: Q8
//                Year: 2021
//                Number of Doors: 4
//
//                Bike Details:
//                Make: Yamaha
//                Model: MT-07
//                Year: 2020
//                Type: Sports

package oct24.vehicle;

public class Vehicle {
	protected String make;
	protected String model;
	protected int year;

	public Vehicle(String make, String model, int year) {
		super();

		this.make = make;
		this.model = model;
		if (year <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.year = year;
	}

	public void displayDetails() {
		System.out.println("Bike Details!!!\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\n");
	}
}
