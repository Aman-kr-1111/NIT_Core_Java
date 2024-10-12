package oct10.movie;

public class MovieMain {

	public static void main(String[] args) {
		// Creating a new Movie object using the parameterized constructor
		Movie m1 = new Movie("Inception", 2010, "Sci-Fi");

		// Accessing movie details using getters
		System.out.println("Accessing Movie Details!!!");
		System.out.println("Title: " + m1.getTitle());
		System.out.println("Release Year: " + m1.getReleaseYear());
		System.out.println("Genre: " + m1.getGenre());

		// Modifying movie details using setters
		m1.setTitle("The Dark Knight");
		m1.setReleaseYear(2008);
		m1.setGenre("Action");

		// Displaying modified movie details
		System.out.println("\nDisplaying Modified Movie Details:");
		m1.displayMovieDetails();
	}

}
