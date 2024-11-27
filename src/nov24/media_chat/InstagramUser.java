package nov24.media_chat;

public class InstagramUser extends User {

	public InstagramUser(String name) {
		super(name);
	}

	public void sendDirectMessage(String message) {
		System.out.println("Direct Message Sent: " + message);
	}

}
