package dec17.mutithreading.course;

public class EducationInstitute {
	private Course[] courses;
	private Offer[] offers;

	public EducationInstitute() {
		super();
		courses = new Course[] { new Course(1, "Mathematics", 1000.0), new Course(2, "Science", 1200.0),
				new Course(3, "English", 900.0) };

		offers = new Offer[] { new Offer("Special discount: Get 20% off on all courses!"),
				new Offer("Limited time offer: Enroll in any two courses and get one course free!") };
	}

	public Course[] getCourses() {
		return this.courses;
	}

	public Offer[] getOffers() {
		return this.offers;
	}

	public void enrollStudentInCourse(int courseId, String studentName) {
		for (Course course : courses) {
			if (course.getCourseId() == courseId) {
				System.out.println(studentName + " has enrolled in the course: " + course.getCourseName() + "\n");
				return;
			}
		}
		System.out.println("Course with ID " + courseId + " not found.");
	}

}
