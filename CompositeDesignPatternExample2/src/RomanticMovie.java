public class RomanticMovie implements IMovie {
    private int id;
    private String movieName;
    private double imdb;

    public RomanticMovie(int id, String movieName, double imdb){
        this.id = id;
        this.movieName = movieName;
        this.imdb = imdb;
    }

    @Override
    public void showInfo() {
        System.out.println("film adı: " + movieName +"id: "+  id +"imdb: " + imdb);
    }
}
