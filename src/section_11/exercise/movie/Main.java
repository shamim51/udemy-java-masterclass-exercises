package section_11.exercise.movie;

public class Main {

    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("Comedy", "hello");
//        movie.watchMovie();
        Adventure movie = (Adventure) Movie.getMovie("A", "Jaws");
        Comedy movie2 = (Comedy) Movie.getMovie("C", "hello");
        movie.watchMovie();
        movie2.watchMovie();
    }
}
