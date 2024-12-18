package dec17.mutithreading.course;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		EducationInstitute institute = new EducationInstitute();

		Student student1 = new Student("Virat", institute);
		Student student2 = new Student("Dhoni", institute);

		Thread thread1 = new Thread(student1);
		Thread thread2 = new Thread(student2);

		thread1.start();
		thread1.join();
		thread2.start();
	}
}
