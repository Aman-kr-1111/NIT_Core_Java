package oct15.taskmanagement;

public class TaskMain {

	public static void main(String[] args) {
		Task t1 = new Task("Finish Project", "Complete documentation", "High");
		printDetails(t1);

//		Task t2 = new Task("", "Complete documentation", "High");

//		Task t3 = new Task("Finish Project", "", "High");

//		Task t4 = new Task("Finsh Project", "Complete documentation", "");

	}

	public static void printDetails(Task t) {
		System.out.println("Title : " + t.getTitle());
		System.out.println("Description : " + t.getDescription());
		System.out.println("Priority : " + t.getPriority());
		System.out.println("Is task completed : " + t.isCompleted());
	}
}
