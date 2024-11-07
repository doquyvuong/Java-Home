package Day4.BT3.Music;

public class CompactDisc {
     private String title ;
     private String artist ;
     private double price ;
     private String code ;

    public CompactDisc() {
    }

    public CompactDisc(String title, String artist, double price, String code) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Music CD - Title: " + title +
                ", Artist: " + artist +
                ", Price: " + price +
                ", Code: " + code;
    }
}
