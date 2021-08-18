
public class Movie {
	
	private String movieName;
	private String movieDetail;
	private int movieYear;
	private String movieScore;
	
	public Movie() {
		
	}

	public Movie(String movieName, String movieDetail, int movieYear, String movieScore) {
		this.movieName = movieName;
		this.movieDetail = movieDetail;
		this.movieYear = movieYear;
		this.movieScore = movieScore;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDetail() {
		return movieDetail;
	}

	public void setMovieDetail(String movieDetail) {
		this.movieDetail = movieDetail;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

	public String getMovieScore() {
		return movieScore;
	}

	public void setMovieScore(String movieScore) {
		this.movieScore = movieScore;
	}

	
	
	
	
	
	
}
