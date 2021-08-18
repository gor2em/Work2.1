
public class MovieService {

	
	public void add(Movie movie) {
		System.out.println(movie.getMovieName() + " filmi eklendi...");
	}
	
	Movie movie1 = new Movie("Yüzüklerin Efendisi", "xxx", 2002, "8.8");
	Movie movie2 = new Movie("Yýldýzlararasý", "xxx", 2014, "8.6");
	Movie movie3 = new Movie("Baþlangýç", "xxx", 2010, "8.5");
	Movie movie4 = new Movie("Baba", "xxx", 1972, "9.2");
	Movie movie5 = new Movie("Enes Batur", "xxx", 2018, "1.0");
	Movie movie[] = { movie1, movie2, movie3, movie4, movie5 };
	
	public Movie[] getAllMovie() {
		return movie;
	}
	
	

}
