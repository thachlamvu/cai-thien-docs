import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a;
        double b;
        double c;

        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = ip.nextDouble();
        System.out.print("Nhap b = ");
        b = ip.nextDouble();
        System.out.print("Nhap c = ");
        c = ip.nextDouble();

        tinhPhuongTrinhBac2(a, b, c);

    }

    public static void tinhPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co nghiem x = " + (-c / b));
            }
            return;
        }

        double delta = b * b - 4 * a * c;
        double x1;
        double x2;

        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem, \n x1 = " + x1 + "\n x2 = " + x2);
        } else if (delta == 0) {
            x1 = (double) (-b / (2 * a));
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
