package Day5.BT3;

public class Circle implements Shape {
    double pi = 3.14;
    double r ;

    public Circle() {
    }

    public Circle( double r) {
        this.r = r;
    }

    public void ShowArea() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + pi +
                ",Ban kinh=" + r +
                '}';
    }
}
