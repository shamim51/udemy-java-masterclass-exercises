package section_10.playList_45;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return this.title + " : "+this.duration;
    }
    public String getTitle() {
        return title;
    }

}
