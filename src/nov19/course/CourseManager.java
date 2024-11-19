package nov19.course;

public class CourseManager {
	public void processContent(CourseContent content) {
		if (content instanceof Video) {
			System.out.println(
					"Processing Video: " + content.getTitle() + ", Duration: " + ((Video) content).getDuration());

		} else if (content instanceof Article) {
			System.out.println(
					"Processing Article: " + content.getTitle() + ", Author: " + ((Article) content).getAuthor());
		} else if (content instanceof Quiz) {
			System.out.println("Processing Quiz: " + content.getTitle() + ", Questions: "
					+ ((Quiz) content).getNumberOfQuestions());
		}
	}

	public void processMultipleContents(CourseContent... contents) {
		for (CourseContent content : contents) {
			processContent(content);
		}
	}
}
