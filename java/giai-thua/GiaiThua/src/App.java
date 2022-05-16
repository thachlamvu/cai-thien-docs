import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap N = ");
        n = ip.nextInt();
        System.out.println("Giai thua cua " + n + " = " + tinhGiaiThua(n));
    }

    public static double tinhGiaiThua(int n) {
        double ketQua = 1;
        if (n == 0 || n == 1) {
            return ketQua;
        } else {
            for (int i = 2; i <= n; i++) {
                ketQua *= i;
            }

            return ketQua;
        }
    }

    public static double tinhGiaiThuaDeQuy(int n) {
        if (n > 0) {
            return n * tinhGiaiThuaDeQuy(n - 1);
        }else {
            return 1;
        }
    }
}
