//Q :A Hierarchical Model of Animals========================================
//
//Scenario Description:
//
//In a virtual zoo management system,you need to organize and categorize various types of animals to efficiently manage their characteristics and behaviors.To achieve this,you decide to implement a
//class hierarchy
//using multilevel inheritance.
//
//1.
//Create the
//Animal Class Requirements:
//Define a
//private String attribute
//named name.
//Implement a
//parameterized constructor
//to initialize
//name.Implement getter
//and setter methods for
//name.Create a
//method to
//display the animal'sdetails.
//
//2.
//Create the
//Mammal Class Requirements:
//Extend the Animal class.
//Add a
//private boolean attribute
//named hasFur.
//Implement a
//parameterized constructor
//to initialize
//
//name (from Animal) and hasFur.
//Implement getter and setter methods for hasFur.
//Override the displayDetails method to include information about fur.
//
//3. Create the Dog Class
//Requirements:
//Extend the Mammal class.
//Add a
//
//private String attribute
//named breed.
//Implement a
//parameterized constructor
//to initialize name,
//
//hasFur (from Mammal), and breed.
//Implement getter and setter methods for breed.
//Override the displayDetails method to include information about the breed.
//
//4. Create the Main Class
//Requirements:
//Create an instance of the Dog class.
//Display details of the Dog object to demonstrate inheritance.
//
//
//Condition :
//-----------
//if any numeric value is zero or negative then print "Error Invalid Input".
//
//
//TEST CASE 1 :
//-------------
//sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
//                
//sample output : Error Invalid Input
//
//
//
//TEST CASE 2 :
//-------------
//sample input : Dog myDog = new Dog("Buddy", true, "Golden Retriever");
//               
//sample output : 
//               Dog Details:
//               Animal Name: Buddy
//               Has Fur: Yes
//               Breed: Golden Retriever

package oct25.animals;

public class Animals {
	private String name;

	public Animals(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayDetails() {
		System.out.println("Animals Details!!!" + "\nAnimal Name : " + getName());
	}

}
