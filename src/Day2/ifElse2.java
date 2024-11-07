package Day2;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A,B,C;

        System.out.println("Nhap 2 so A,B,C :");
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        System.out.println("Giai phuong trinh Ax+B=0 ");
        if(A == 0){
            if(B == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            }else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }else {
            System.out.println("X = " +(float)-B/A);
        }

        System.out.println("Giai phuong trinh Ax2+Bx+C=0 ");
        if(A==0){
            if(B!=0){
                System.out.println("X = " +(float)-C/B);
            }else if(C==0){
                System.out.println("Phuong trinh co vo so nghiem.");
            }else{
                System.out.println("Phuong trinh vo nghiem.");
            }
        }else{
            double delta = B*B-4*A*C;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem.");
            }else if(delta == 0){
                System.out.println("Phuong trinh co 2 nghiem giong nhau: X1 = X2 = " +(float)-B/(2*A));
            }else{
                System.out.println("Phuong trinh co 2 nghiem rieng biet: X1 = " +(float)(-B-Math.sqrt(delta)) / (2*A) +" va X2 = " +(float)(-B+Math.sqrt(delta)) / (2*A));
            }
        }
    }
}
