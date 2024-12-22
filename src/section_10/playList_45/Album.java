package section_10.playList_45;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song song: songs){
            if((song.getTitle()).equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist){
        if(songs.size() < trackNo){
            System.out.println("There is not track "+ trackNo);
            return false;
        }
        Song song = songs.get(trackNo-1);
        if(song != null){
            playlist.add(song);

        }

        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){

        Song song = findSong(title);
        if(song != null){
            playlist.add(song);
            return true;
        }
        System.out.println("Dose not exists");
        return false;
    }

    public void printSongs(){
        System.out.println("Album -> "+ this.name+" artist -> "+this.artist);
        for (Song song: songs){
            System.out.println(song);
        }
    }
}
