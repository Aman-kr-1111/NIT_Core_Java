package nov22.social_media;

public class TextPost implements Post {
	private String textContent;
	int likes;

	public TextPost(String textContent) {
		super();

		if (textContent == null || textContent.trim().isEmpty()) {
			System.err.println("Error: Text content cannot be empty.");
			System.exit(0);
		}

		this.textContent = textContent;
		likes = 0;
	}

	@Override
	public void publish() {
		System.out.println("Post Published: " + textContent);

	}

	@Override
	public void like() {
		likes++;
		System.out.println("Post Liked! Total likes: " + likes);
	}

	public String getTextContent() {
		return textContent;
	}

}
