package nov24.media_chat;

public class InstagramChat implements Messanger {

	@Override
	public void sendMessage(User u) {
		if (u instanceof InstagramUser) {
			System.out.println("Message sent successfully to Instagram user.");
		} else {
			System.err.println("Error: User is not an Instagram user.");
			System.exit(0);
		}
	}

}
