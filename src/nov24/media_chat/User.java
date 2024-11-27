package nov24.media_chat;

public class User {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public void displayMessage(String message) {
		System.out.println("User: " + name + " - Message: " + message);
	}
}
