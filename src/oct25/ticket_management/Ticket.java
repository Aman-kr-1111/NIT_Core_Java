//Q :Ticket Management System with VIP and Student Tickets=============================================================
//
//You have been hired by an event management company to develop a ticketing system that can manage different types of tickets for various events.The system needs to handle regular tickets,VIP tickets with special access privileges,and student tickets that may have a discount.Your task is to create a Java program with the following requirements:
//
//Design a Ticket
//class with
//attributes like
//event name, seat number,
//and price.
//
//1.
//Create a
//
//class Ticket------------------------
//
//Instance variable:-
//
//String eventName,
//private
//
//int seatNumber,
//private
//
//double price,private
//
//Create a
//parameterized constructor for
//all Instance
//variable to
//initialize the
//variable.
//
//Generate Getters
//and setters for
//all Instance
//variable to
//get values
//and set values.
//
//2.
//Create another
//
//class VIPTicket
//and inherit Ticket
//
//class here.---------------------------------------------------------------
//
//Instance variable:-
//
//String specialAccess,private
//
//Create a
//parameterized constructor for
//Instance variable
//to initialize
//the variable.
//
////Use super keyword to initialize Ticket class constructor attributes.
//
//Generate Getters
//and setters for
//Instance variable
//to get
//values and
//set values.
//
//3.
//Create another
//
//class StudentTicket
//and inherit Ticket
//
//class here.-------------------------------------------------------------------
//
//Instance variable:-
//
//boolean studentDiscount,private
//
//Create a
//parameterized constructor for
//Instance variable
//to initialize
//the variable.
//
////Use super keyword to initialize Ticket class constructor attributes.
//
//Generate Getters
//and setters for
//Instance variable
//to get
//values and
//set values.
//
//Create a
//
//class MainTicket
//which contains
//main method
//to demonstrate
//the usage.
//
////Creating a Ticket object using the parameterized constructor
//
////Creating a VIPTicket object using the parameterized constructor
//
////Creating a StudentTicket object using the parameterized constructor
//
//Condition:-----------if
//any numeric
//value is
//zero or
//negative then print"Error Invalid Input".
//
//TEST CASE 1:-------------
//sample input:
//When your
//reading values for Ticket
//
//class OR
//VIPTicket OR
//StudentTicket then
//make sure if
//any numeric
//value is<=0
//then print"Error Invalid Input".
//
//sample output:
//Error Invalid
//Input
//
//
//
//TEST CASE 2:-------------
//sample input:
//Ticket regularTicket = new Ticket("Concert", 101, 50.0);
//VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
//StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
//
//sample output:
//Regular Ticket:Event:
//Concert Seat Number:101 Price:$50.0
//
//VIP Ticket:Event:
//VIP Concert
//Seat Number:201 Price:$100.0
//Special Access:
//Backstage Access
//
//Student Ticket:Event:
//Student Event
//Seat Number:301 Price:$30.0
//Student Discount:true

package oct25.ticket_management;

public class Ticket {
	private String eventName;
	private int seatNumber;
	private double price;

	public Ticket(String eventName, int seatNumber, double price) {
		super();
		this.eventName = eventName;

		if (seatNumber <= 0 || price <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.seatNumber = seatNumber;
		this.price = price;
	}

	public String getEventName() {
		return eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("Regular Ticket!!!" + "\nEvent : " + getEventName() + "                \nSeat Number :"
				+ getSeatNumber() + "\nPrice : $" + getPrice());
	}

}
