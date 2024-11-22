package nov22.social_media;

public class PostMain {

	public static void main(String[] args) {
//		TextPost post1 = new TextPost("");
//		post1.publish();
//		post1.like();

		TextPost post2 = new TextPost("Hello, world!");
		post2.publish();
		post2.like();
		post2.like();

		System.out.println("\nPost 1: " + post2.getTextContent() + " | Likes: " + post2.likes);
	}

}
