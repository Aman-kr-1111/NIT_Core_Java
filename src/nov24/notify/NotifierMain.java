package nov24.notify;

public class NotifierMain {

	public static void main(String[] args) {
		EmailNotifier emailNotifier = new EmailNotifier();
		User u1 = new User("Alice", "alice@example.com");
		User u2 = new User("Bob", "bob@example.com");
		emailNotifier.notifyUsers(u1, u2);
		User u3 = new User("Charlie", "charlie@example.com");
		emailNotifier.notifyUsers(u3);
		User u4 = new User("Frank", null);
		User u5 = new User("Grace", null);
		emailNotifier.notifyUsers(u4, u5);

	}

}
