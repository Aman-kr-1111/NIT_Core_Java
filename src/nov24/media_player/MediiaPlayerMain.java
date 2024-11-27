package nov24.media_player;

public class MediiaPlayerMain {

	public static void main(String[] args) {
		MusicPlayer mp1 = new MusicPlayer("Life");
		mp1.play();
		mp1.pause();
		mp1.stop();

		System.out.println();
		VideoPlayer vp1 = new VideoPlayer("Life");
		vp1.play();
		vp1.pause();
		vp1.stop();

	}

}
