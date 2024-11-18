//Develop a booking and maintenance system for a Hostel Create a
//class named
//as Room
//
//Attributes:roomType:String (private)
//
//Contains an instance initializer block that sets default values for room properties. and with some relevant message.
//
//impliment three method 
//
//name :bookRoom()
//return type :void
//
//overload the bookRoom methods 
//
//name :bookRoom
//return Type :void
//Arguments :String 
//Access Modifier :
//
//public
//
//Take one
//more overridden
//method
//
//name:cleanRoom return Type:
//void Access Modifier:
//public
//
//Take another
//
//class HostelRoom
//which is
//subclass of
//Room
//
//Attributes:
//
//bedType(String)
//
//private
//
//Contains an
//instance initializer
//block that sets default values for
//room properties.
//and with
//some relevant
//message.
//
//impliment three
//method
//
//name:bookRoom()
//return type :void
//
//overload the bookRoom methods 
//
//name :bookRoom()
//return Type :void
//Arguments :String ,String
//Access Modifier :public
//this method is giving information about roomtype and bedtype
//
//Take one more overridden method
//
//name :cleanRoom
//return Type :void
//Access Modifier :public
//
////for achieving the runtime polymerphism this method print the specific message.
//
//Take a main
//
//class which
//is having
//main method
//and instantiate
//the object
//and calling
//the methods.
//
//Test cases:-------------case-1--------
//Booking a
//HostelRoom with
//an empty
//bed type:
//
//Sample Input:hostelRoom.bookRoom("Deluxe Hostel Room","")
//Expected Output:Error:
//Bed type
//cannot be null
//or empty.
//
//case-2--------
//Booking a
//HostelRoom with
//valid room
//type and
//bed type:
//
//Sample Input:hostelRoom.bookRoom("Deluxe Hostel Room","Double Bed")
//
//Expected Output:
//Deluxe Hostel
//Room with
//Double Bed booked

package nov18.hostel;

public class Hostel {
	private String roomType;

	{
		roomType = "Standard Room";
		System.out.println("Room initialized with default values.");
	}

	public void bookRoom() {
		System.out.println("Room booked with default settings.");
	}

	public void bookRoom(String roomType) {
		this.roomType = roomType;
		System.out.println(roomType + " booked successfully.");
	}

	public void cleanRoom() {
		System.out.println("Room cleaning scheduled.");
	}
}
