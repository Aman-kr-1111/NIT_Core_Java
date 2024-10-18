//Programming Question:Student Class with Grade Calculation
//
//Design a Java
//class named
//Student that
//encapsulates information
//about students, including name,ID,course,fee,grade,
//and average.Your
//
//class should
//include a constructor for
//creating a
//student object
//by copying
//another student
//object and
//a method
//to calculate
//the grade
//based on
//the average.
//
//Take a Student class(BLC Class)
//
//should have
//the following elements:
//
//Attributes/properties/varriables:
//
//Names			data type---------------------------Name:
//String
//ID:
//int Course:
//String
//Fee:
//double Grade:
//char Average:
//double
//
//Acess Modifier:private(for
//all Varriables)
//
//Constructors:
//
//A parameterized
//constructor that
//initializes a
//student object
//with basic information,
//such as name,ID,course,
//and fee.
//
//A parameterized
//constructor that
//initializes a
//student object
//by copying
//another student object.(copy constructor)
//
//Method:
//
//Method Name:
//
//calculateGrade()
//Access modifier :
//
//public Return Type:
//char
//
//that
//initialize the
//grade of
//a student
//based on
//the average.
//Use the
//following grading scale:
//
//A:Average>=90 B:Average>=80 C:Average>=70 D:Average>=60 F:Average<60
//
//Tester Class:(ELC Class)
//
//In the
//main method, demonstrate
//the usage
//of the Student
//
//class by
//creating instances
//with different constructors,
//setting average values,
//and calculating
//grades.
//
//
//Test Case-1:---------------
//Valid Case:
//
//Average=76
//
//Sample Input:average=76
//
//Expected Output:"Grade for average 76: C"
//
//Test Case-2:---------------
//
//Valid Case:Average=58
//
//Sample Input:average=58
//
//Expected Output:"Grade for average 58: F"
//
//Test Case-3:----------------
//Invalid Case:mark=-10
//
//Input:mark=-10
//Expected Output:"Error: Average mark must be between 0 and 100."

package oct18.student;

public class Student {
	private String name;
	private int id;
	private String course;
	private double fee;
	private char grade;
	private double average;

	public Student() {
		super();
	}

	public Student(String name, int id, String course, double fee) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
		this.fee = fee;
	}

	public Student(Student stu) {
		this.name = stu.name;
		this.id = stu.id;
		this.course = stu.course;
		this.fee = stu.fee;
		this.average = stu.average;
		this.grade = stu.grade;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		if (average < 0 || average > 100) {
			System.err.println("Error: Average must be between 0 and 100.");
			System.exit(0);
		}
		this.average = average;
	}

	public char calculateGrade() {

		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else if (average >= 60) {
			grade = 'D';
		} else if (average >= 0) {
			grade = 'F';
		}
		return grade;
	}

}
