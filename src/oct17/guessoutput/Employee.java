package oct17.guessoutput;

public class Employee {
	int id = 100;// id=900

	public static void main(String[] args) {
		int val = 200;
		Employee e1 = new Employee();
		e1.id = val;
		update(e1);
		System.out.println(e1.id);// 900
		Employee e2 = new Employee();
		e2.id = 500;
		switchEmployees(e2, e1);
		// GC
		System.out.println(e1.id);// 900
		System.out.println(e2.id);// 900
	}

	public static void update(Employee e) {
		e.id = 900;
		e = new Employee();
		e.id = 400;// id=400
	}

	public static void switchEmployees(Employee e1, Employee e2) {
		int temp = e1.id;// t = 500
		e1.id = e2.id;// e1.id = 900

		e2 = new Employee();
		e2.id = temp;
	}
}
