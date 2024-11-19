package nov19.course;

public class Video extends CourseContent {
	private int duration;

	public Video(String title, int duration) {

		super(title);

		if (duration < 0) {
			System.err.println("Error message :invalid duration for video");
		}
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

}
