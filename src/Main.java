
public class Main {

	public static void main(String[] args) {
		
		MovieService movieService = new MovieService();
		Movie movie1 = new Movie("Parazit","xxx",2019,"8.6");
		movieService.add(movie1);
		
		
		
		for(Movie movie : movieService.getAllMovie()) {
			System.out.println(movie.getMovieName());
		}
		

	}

}
