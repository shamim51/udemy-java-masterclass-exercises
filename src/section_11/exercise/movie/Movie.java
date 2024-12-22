package section_11.exercise.movie;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instance = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instance+" film");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };

    }
}
