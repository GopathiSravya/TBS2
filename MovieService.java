import java.util.ArrayList;
import java.util.List;

public class MovieService {
    public List<Movie>movies=new ArrayList<>();
    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.println("movie added"+movie);
    }
    public List<Movie>getAllMovies(){
        return movies;
    }
}