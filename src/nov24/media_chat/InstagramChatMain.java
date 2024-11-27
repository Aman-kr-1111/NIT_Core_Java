package nov24.media_chat;

public class InstagramChatMain {

	public static void main(String[] args) {
		InstagramUser instaUser = new InstagramUser("Rahul");
		instaUser.displayMessage("Hello from Instagram!");
		instaUser.sendDirectMessage("Hi there!");

		User normalUser = new User("Aman");
		InstagramChat chat = new InstagramChat();

		chat.sendMessage(instaUser);
		chat.sendMessage(normalUser);
	}

}
