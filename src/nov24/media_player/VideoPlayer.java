package nov24.media_player;

public class VideoPlayer implements AdvancedmediaPlayer {
	private String videoTitle;

	public VideoPlayer(String videoTitle) {
		super();
		if (videoTitle == null || videoTitle.trim().isEmpty()) {
			System.err.println("Error message: Title is not be empty string.");
			System.exit(0);
		}
		this.videoTitle = videoTitle;
	}

	@Override
	public void play() {
		System.out.println("Playing video: " + videoTitle);
	}

	@Override
	public void stop() {
		System.out.println("Stopping video: " + videoTitle);

	}

	@Override
	public void pause() {

		System.out.println("Pausing video: " + videoTitle);
	}

}
