//Calculate Student Percentage====================================
//
//Create a simple Java program using inheritance to manage student data.We have a base
//class Student,
//and two subclasses:
//ScienceStudent and
//ArtsStudent.Each subclass
//should calculate
//the percentage
//of marks
//based on
//its own
//set of
//subjects.The percentage
//calculation will
//be done
//using an
//overridden method.
//
//Define the base
//
//class Student------------------------------Attributes:
//protected Sreing name and
//protected int rollNumber.
//
//Costructor:
//A constructor
//to initialize
//these attributes
//
//Methods:1)
//
//public void displayDetails() a method to display student details.
//         2)
//
//public double calculatePercentage() a method wich will calculate and return percentage.
//
//
//
//Define class SceinceStudent extends from Student class
//---------------------------------------------------------------
//Attributes: private int physicsMarks, private int chemistryMarks, private int mathMarks
//Costructor:  A constructor to initialize current class attributes and super class attributes.
//
//Methods: Override displayDetails() a method to display parent class details as well current class details.
//         Override calculatePercentage() a method wich will calculate and return percentage.
//
//
//
//
//Define class class ArtsStudent extends from Student class
//---------------------------------------------------------
//Attributes: private int historyMarks, private int geographyMarks, private int englishMarks
//
//Costructor:  A constructor to initialize current class attributes and super class attributes.
//
//Methods: Override displayDetails() a method to display parent class details as well current class details.
//         Override calculatePercentage() a method wich will calculate and return percentage.
//
//
//Create Test class
//-----------------
//-> create main method
//-> in main method create ScienceStudent object and  ArtsStudent object.
//-> print the details of both class by calling displayDetails() method.
//-> print the percentage of ScienceStudent & ArtsStudent by calling calculatePercentage() methods.
//
//
//Condition :
//-----------
//if any numeric value is zero or negative then print "Error Invalid Input".
//
//
//TEST CASE 1 :
//-------------
//sample input  : When your reading values for Student Class OR ScienceStudent class OR ArtsStudent class then make sure if any numeric value is <=0 then print "Error Invalid Input".
//                
//sample output : Error Invalid Input
//
//
//TEST CASE 2 :
//-------------
//sample input : ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);
//               ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);
//
//sample output : 
//                Science Student Details:
//                Name: Anjali
//                Roll Number: 101
//                Physics Marks: 85
//                Chemistry Marks: 90
//                Math Marks: 80
//                Percentage: 85.0%
//                
//                Arts Student Details:
//                Name: Bob
//                Roll Number: 102
//                History Marks: 75
//                Geography Marks: 80
//                English Marks: 85
//                Percentage: 80.0%

package oct24.studentpercent;

public class Student {
	protected String name;
	protected int rollNumber;

	public Student(String name, int rollNumber) {
		super();
		this.name = name;

		if (rollNumber <= 0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.rollNumber = rollNumber;
	}

	public void displayDetails() {
		System.out.println("Student Details!!!\nName: " + name + "                \nRoll Number: " + rollNumber);
	}

	public double calculatePercentage() {
		return 0D;

	}
}
