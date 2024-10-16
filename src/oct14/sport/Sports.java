
//Design sports Model system
//
//Create a
//class name
//Sports (BLC Class)
//
//
//Atributes :
//
//name 			Data Type
//-------			--------------
//sportName                    :String 
//
//teamSize		     :int 
//
//sportType                    :String 
//
//Acess modifier  :private (for all varriable)
//
//Take a no parameterized constructor and initialize all the default values to varriables.
//
//Take one more constructor with two parameteres sportName and teamSize
//and intialize with user values and write the validation logic
//
//Take another constructor with 3 parameters and intialize all the values and check the validation.
//
//Methods  :
//
//Method Name     : displayInfo
//Return Type 	     : void
//Acess Modifier    :
//
//public
//
//and in this
//method to
//print all
//the details
//of the class.
//
//Take a
//
//Main Class(ELC Class)wich having main method and instatiate the object and execute the method.
//
//Test Cases:
//-------------
//
//for teamSize. If teamSize is less than or equal to zero, it sets teamSize to 0 and prints an error message.
//
//Test Case 1: Valid sport with name and team size
//Sport Name: Football
//Team Size: 11
//Sport Type: Unknown
//
//Expected Output :
//---------------------
//(print the details)
//
//Test Case 2: Invalid sport with negative team size
//Error: Team size must be positive.
//Sport Name: Volleyball
//Team Size: -1
//Sport Type: Unknown
//
//Expected Output :
//---------------------
//Error: Team size must be positive.

package oct14.sport;

public class Sports {
	private String sportName;
	private int teamSize;
	private String sportType;

	public Sports() {
		super();
	}

	public Sports(String sportName, int teamSize) {
		super();

		if (sportName.trim().isEmpty()) {
			System.out.println("Error : Sport name cannot be empty.");
			System.exit(0);
		} else {
			this.sportName = sportName;
		}
		if (teamSize <= 0) {
			System.out.println("Error : Team size must be positive.");
			teamSize = 0;
			System.exit(0);
		} else {
			this.teamSize = teamSize;
		}
	}

	public Sports(String sportName, int teamSize, String sportType) {
		super();

		if (sportName.trim().isEmpty() || sportName == null) {
			System.out.println("Error : Sport name cannot be empty.");
			System.exit(0);
		} else {
			this.sportName = sportName;
		}
		if (teamSize <= 0) {
			System.out.println("Error : Team size must be positive.");
			teamSize = 0;
			System.exit(0);
		} else {
			this.teamSize = teamSize;
		}

		if (sportType.trim().isEmpty()) {
			System.out.println("Error : Sport type cannot be empty.");
			System.exit(0);
		} else {
			this.sportType = sportType;
		}
	}

	public void displayInfo() {
		System.out.println("Sport Name : " + sportName);
		System.out.println("Team Size : " + teamSize);
		System.out.println("Sport type : " + sportType);
		System.out.println();
	}
}
