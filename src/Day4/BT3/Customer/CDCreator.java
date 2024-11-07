package Day4.BT3.Customer;

import Day4.BT3.Music.CompactDisc ;

public class CDCreator  {
    private CompactDisc[] music;
    private Day4.BT3.Movie.CompactDisc[] movie ;

    private int nextAlbum = 0;
    private int maxAlbum;
    private int nextMovie = 0;
    private int maxMovie;

    public CDCreator(int maxAlbum, int maxMovie) {
        this.maxAlbum = maxAlbum;
        this.maxMovie = maxMovie;
        music = new CompactDisc[maxAlbum];
        movie = new Day4.BT3.Movie.CompactDisc[maxMovie];
    }

    public void addMusicCD(CompactDisc newCD) {
        if(nextAlbum<maxAlbum){
            music[nextAlbum++] = newCD;
            System.out.println("CD nhac da duoc them vao.");
        }else {
            System.out.println("Album da day.");
        }
    }

    public void addMovieCD(Day4.BT3.Movie.CompactDisc newCD) {
        if(nextMovie<maxMovie){
            movie[nextMovie++] = newCD;
            System.out.println("CD phim da duoc them vao.");
        }else {
            System.out.println("movie da day.");
        }

    }

    public void displayAllMusic() {
        System.out.println("Danh sach nhac: ");
        for(int i=0; i<nextAlbum; i++){
            System.out.println(music[i]);
        }
    }

    public void displayAllMovie() {
        System.out.println("Danh sach phim: ");
        for(int i=0; i<nextMovie; i++){
            System.out.println(movie[i]);
        }
    }
}
