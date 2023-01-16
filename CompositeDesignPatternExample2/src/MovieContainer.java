import java.util.ArrayList;
import java.util.List;

public class MovieContainer implements IMovie{
    public List<IMovie> movies;
    public MovieContainer(){
        movies = new ArrayList<IMovie>();
    }

    public void add(IMovie movie){
        movies.add(movie);
    }
    public void remove(IMovie movie){
        movies.remove(movie);
    }

    @Override
    public void showInfo() {
        for(IMovie movie : movies){
            movie.showInfo();
        }
    }
}
