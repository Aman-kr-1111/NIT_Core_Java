//Design a Movie
//class with
//attributes like title,
//release year, and
//genre.
//
//Create a
//
//class Movie(Business Logic Class)
//Instance Variables:
//String title-
//private int releaseYear-
//private String genre-
//private
//
//Create a
//parameterized constructor
//to initialilize
//all the
//fields.Create getters
//and setters method for
//all the
//fields.
//
//		Create another
//
//class Main
//which contains
//
//main method (ELC class) which will receive all the instance variable value from BLC class.
//Use elc class for:-
// Accessing movie details using getters
// Modifying movie details using setters
// Displaying modified movie details

package oct10.movie;

public class Movie {
	private String title;
	private int releaseYear;
	private String genre;

	public Movie(String title, int releaseYear, String genre) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void displayMovieDetails() {
		System.out.println("Movie Title: " + title);
		System.out.println("Release Year: " + releaseYear);
		System.out.println("Genre: " + genre);
	}

}
