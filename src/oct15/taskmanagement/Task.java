//You are developing a task management application that allows users to create and manage their tasks efficiently.
//
//Design a Java
//class named
//Task (Business Class)
//
//Attributes :
//
//name			data type
//-------			------------
//title			: String
//description		: String
//priority		: String
//
//Acess modifier : private(for all varriables)
//
//Constructor: Initialize the task object all properties.
//
//
//Methods:
//[Return type of all methods is
//
//void and
//acess modifier is
//
//public]
//
//updateDescription(String newDescription): This method should update the description of the task.
//
//updatePriority(String newPriority): This method should update the priority level of the task.
//
//markAsCompleted(): This method should mark the task as completed.
//
//getTitle(): This method should return the title of the task.
//
//getDescription(): This method should return the description of the task.
//
//getPriority(): This method should return the priority level of the task.
//
//isCompleted(): This method should return true if the task is completed, and false otherwise.
//
//
//Create another class main which is having main method and instantiate the task object and execute the method.
//
//Test Cases :
//
//case -1
//---------
//Task Title: Finish Project
//Task Description: Complete documentation
//Task Priority: High
//Is Task Completed? false
//
//Expected Output: 
//Valid input, (print all the above information)
//
//case-2
//---------
//Title: ""
//Description: "Complete documentation"
//Priority: "High"
//
//Expected Output: 
//Error message indicating invalid title.
//
//case-3
//--------
//Title: "Finish Project"
//Description: ""
//Priority: "High"
//
//Expected Output: 
//Error message indicating invalid description

package oct15.taskmanagement;

public class Task {
	private String title;
	private String description;
	private String priority;
	private boolean completed = false;

	public Task() {
		super();
	}

	public Task(String title, String description, String priority) {
		super();

		updateTitle(title);
		updateDescription(description);
		updatePriority(priority);
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getPriority() {
		return priority;
	}

	public void updateTitle(String title) {
		if (title.trim().isEmpty()) {
			System.err.println("Invalid title");
			System.exit(0);
		}
		this.title = title;
	}

	public void updateDescription(String description) {
		if (description.trim().isEmpty()) {
			System.err.println("Invalid description");
			System.exit(0);
		}
		this.description = description;
	}

	public void updatePriority(String priority) {

		if (priority.trim().isEmpty()) {
			System.err.println("Invalid priority");
			System.exit(0);
		}
		this.priority = priority;
	}

	public void markAsCompleted() {
		completed = true;
	}

	public boolean isCompleted() {
		return completed;
	}
}
