//Design a Course Content Management System
//
//=>Create a super Class CourseContent with a common attribute.
//
//Attribute:title:String(private)
//
//take a parameterize constructor to initialize the varriables
//
//generate the getter methods for accessing varriables.
//
//=>Create a subclass Video which is extending from CourseContent
//
//Attributes:duration:int(private)
//
//take a parameterize constructor to initialize the varriables
//
//generate the getter methods for accessing varriables.
//
//=>Take another
//class Article
//which is
//subclass of
//CourseContent
//
//Attributes:
//
//author:
//
//String  (private)
//
//take a parameterize constructor to initialize the varriables
//
//generate the getter methods for accessing varriables.
//
//
//=>Take another class Quiz  which is subclass of CourseContent
//
//Attributes :
//
//numberOfQuestions  : int  (private)
//
//take a parameterize constructor to initialize the varriables
//
//generate the getter methods for accessing varriables.
//
//
//Then now take one class CourseManager
//
//in this class it is having two  method
//
//Methods:
//----------
//method name :processContent
//Return Type 	 :void
//Arguments	 :CourseContent 
//Acess modifier :public
//
//this method is to identify and process the type of content  using the "instanceOf" operator.
//
//
//Take another method 
//method name :processMultipleContents
//Return Type 	 :void
//Arguments	 :CourseContent[varargs type]
//Acess modifier :public
//
//this method is to process multiple contents using varargs.
//
//Devlop a ELC Class named as MainCourse
//which is having main method   inside this  create instances of Video, Article, and Quiz.
//Use CourseManager to process individual and multiple contents.
//
//
//Example :-
//
//Test Case -1:
//Invalid Duration for Video
//Input:
//duration= -45;
//
//Expected Output :
//error message :invalid duration for video
//
//Test Case-2 :
//
//Input:
//duration :45
//
//Expected Output :

package nov19.course;

public class CourseContent {
	private String title;

	public CourseContent(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
