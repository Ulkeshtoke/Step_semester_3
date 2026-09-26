
import java.util.Arrays;

public class Playlist {

    private String[] songs;
    private int count;

    public Playlist(int capacity) {
        songs = new String[capacity];
        count = 0;
    }

    public void addSong(String song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
        } else {
            System.out.println("Playlist is full.");
        }
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    public int getSongCount() {
        return count;
    }

    public static void main(String[] args) {

        Playlist playlist = new Playlist(3);

        playlist.addSong("Perfect");
        playlist.addSong("Believer");
        playlist.addSong("Shape of You");

        System.out.println("Song count: " + playlist.getSongCount());

        String[] copy = playlist.getSongs();

        System.out.println("Songs:");
        for (String song : copy) {
            System.out.println(song);
        }

        copy[0] = "Changed Song";

        System.out.println("Original first song: "
                + playlist.getSongs()[0]);
    }
}
