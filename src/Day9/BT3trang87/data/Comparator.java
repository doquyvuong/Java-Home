package Day9.BT3trang87.data;

public class Comparator {
    //ascending - sắp xếp tăng dần
    // descending - sắp xếp giảm dần
    public class SortByPriceAscending implements java.util.Comparator<Laptop> {

        @Override
        public int compare(Laptop o1, Laptop o2) {
            // trả về âm
            // trả về 0
            // trả về dương
            // Muốn tăng dần, thì o1 > o2
            // Muốn giảm dần thì o2 > o1
            return (int) ( o1.getPrice() - o2.getPrice());
        }
    }

    public class SortByPriceDescending implements java.util.Comparator<Laptop> {

        @Override
        public int compare(Laptop o1, Laptop o2) {
            // trả về âm
            // trả về 0
            // trả về dương
            // Muốn tăng dần, thì o1 > o2
            // Muốn giảm dần thì o2 > o1
            return (int) (o2.getPrice() - o1.getPrice());
        }
    }
}
