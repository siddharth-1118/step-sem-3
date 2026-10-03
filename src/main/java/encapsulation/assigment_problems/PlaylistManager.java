package encapsulation.assigment_problems;

import java.util.Arrays;

public class PlaylistManager {

    public static class Playlist {
        private String[] songs;
        private int count;

        public Playlist(int capacity) {
            this.songs = new String[capacity];
            this.count = 0;
        }

        public void addSong(String song) {
            if (song != null && count < songs.length) {
                songs[count++] = song;
            }
        }

        public String[] getSongs() {
            return Arrays.copyOf(songs, count);
        }

        public int getSongCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("Original 1st song: " + p.getSongs()[0]);
        System.out.println("Song count: " + p.getSongCount());
    }
}
