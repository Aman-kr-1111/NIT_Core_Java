package dec17.mutithreading.course;

public class Course {
	private int courseId;
	private String courseName;
	private double courseFee;

	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return courseId + ". " + courseName + " - Fee: Rs." + courseFee;

	}

	public int getCourseId() {
		return this.courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public double getCourseFee() {
		return this.courseFee;
	}

}
