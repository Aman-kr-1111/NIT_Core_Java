package nov24.media_player;

public class MusicPlayer implements AdvancedmediaPlayer {
	private String songTitle;

	public MusicPlayer(String songTitle) {
		super();
		if (songTitle == null || songTitle.trim().isEmpty()) {
			System.err.println("Error message: Title is not be empty string.");
			System.exit(0);
		}
		this.songTitle = songTitle;
	}

	@Override
	public void play() {
		System.out.println("Playing music: " + songTitle);
	}

	@Override
	public void stop() {
		System.out.println("Stopping music: " + songTitle);

	}

	@Override
	public void pause() {

		System.out.println("Pausing music: " + songTitle);
	}

}
