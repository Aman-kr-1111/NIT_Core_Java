//Create a Vehicle Class:

//Attributes:
//String vehicleModel, String licensePlate, String color, double engineCapacity 

//Methods:
//void setVehicleDetails(String vehicleModel,String licensePlate,String color,double engineCapacity)String getVehicleDetails():Returns a formatted string with vehicle information.

//Take another ELC class TestVehicle which is having main method and create instance and call the method and pass the argument by using Scanner Class.

package test.oct05.program.vehicle;

public class Vehicle {
	private String vehicleModel;
	private String licensePlate;
	private String color;
	private double engineCapacity;

	public void setVehicleDetails(String vehicleModel, String licensePlate, String color, double engineCapacity) {
		this.vehicleModel = vehicleModel;
		this.licensePlate = licensePlate;
		this.color = color;
		this.engineCapacity = engineCapacity;
	}

	public String getVehicleDetails() {
		return "[Vehicle Model : " + vehicleModel + "License Plate : " + licensePlate + "Color : " + color
				+ "Engine Capacity : " + engineCapacity + "].";
	}

}
