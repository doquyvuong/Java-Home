package Day5.BT2;

import java.util.Scanner;

public class Circle extends Point implements Shape {
    double radius;
    int color;

    public Circle() {
        super();
    }

    public Circle(int x, int y, double radius, int color) {
        this.X = x;
        this.Y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Hình tròn có tọa độ (" + X + "," + Y + ")");
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu: " + color);
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }


    public void moveCircle(int dx, int dy) {
        this.X += dx;
        this.Y += dy;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tọa độ x: ");
        int x = sc.nextInt();

        System.out.print("Nhập tọa độ y: ");
        int y = sc.nextInt();

        System.out.print("Nhập bán kính: ");
        double radius = sc.nextDouble();

        System.out.print("Nhập mã màu: ");
        int color = sc.nextInt();
        int choice;
        Circle circle = null;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Tạo hình tròn");
            System.out.println("2. Di chuyển hình tròn");
            System.out.println("3. Vẽ hình tròn");
            System.out.println("4. Tính diện tích hình tròn");
            System.out.println("5. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    circle = new Circle(x, y, radius, color);
                    break;
                case 2:
                    if(circle == null) {
                    System.out.println("Hinh tron chua duoc tao");
                    return;
                    }
                    System.out.println("Nhap toa do dX:");
                    int dx = sc.nextInt();
                    System.out.println("Nhap toa do dY: ");
                    int dy = sc.nextInt();
                    circle.move(dx,dy);
                    break;
                case 3:
                    circle.draw();
                    break;
                case 4:
                    System.out.println("Dien tich hinh tron la: " +circle.area());

                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("------Moi chon lai-----");
            }
        } while (choice != 5);
    }
}
