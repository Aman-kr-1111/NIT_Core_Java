package nov19.course;

public class CourseContentMain {

	public static void main(String[] args) {
		Video v1 = new Video("Java Tutorial", 45);
		Video v2 = new Video("Python Tutorial", -30);
		Article a1 = new Article("OOP Concepts", "John Doe");
		Quiz q1 = new Quiz("Java Basics Quiz", 10);

		CourseManager manager = new CourseManager();

		manager.processContent(v1);
		manager.processContent(v2);
		manager.processContent(a1);
		manager.processContent(q1);

		System.out.println("\n********* Using Var args *********");
		manager.processMultipleContents(v1, a1, q1);
	}
}
