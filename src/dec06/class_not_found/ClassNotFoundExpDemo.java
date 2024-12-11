package dec06.class_not_found;

import java.util.Scanner;

public class ClassNotFoundExpDemo {
	public ClassNotFoundExpDemo(String className) {
		try {
			Class<?> cls = Class.forName(className);
			System.out.println("Class " + className + " found!!!\nclassName: " + cls.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("Class " + className + " not found.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a class name: ");
		new ClassNotFoundExpDemo(scanner.nextLine());
		scanner.close();
	}
}
