package Day4.BT3.Movie;

public class CompactDisc {
    String title ;
    double price ;
    String code ;

    public CompactDisc() {
    }

    public CompactDisc(String title, double price, String code) {
        this.title = title;
        this.price = price;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Movie CD - Title: " + title +
                ", Price: " + price +
                ", Code: " + code;
    }
}
