public class Main {
    public static void main(String[] args) {

       MovieContainer thrillerMovie =  new MovieContainer();
       thrillerMovie.add(new ThrillerMovie(1, "paranormal activities", 4.8));
       thrillerMovie.add(new ThrillerMovie(2, "supernatural", 8.5));

       MovieContainer romanticMovie = new MovieContainer();
       romanticMovie.add(new RomanticMovie(3, "gurur ve önyargı", 9.1));

       MovieContainer movieContainer = new MovieContainer();
       movieContainer.add(thrillerMovie);
       movieContainer.add(romanticMovie);

       movieContainer.showInfo();
    }
}