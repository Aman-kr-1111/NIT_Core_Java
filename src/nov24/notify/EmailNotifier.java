package nov24.notify;

public class EmailNotifier implements Notifier {

	@Override
	public void notifyUsers(User... users) {
		for (User user : users) {
			sendEmail(user);
		}
	}

	private void sendEmail(User u) {
		System.out.println("Sending email to " + u.getName() + " at " + u.getEmail());
	}
}
