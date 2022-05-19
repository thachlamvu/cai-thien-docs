import java.util.Scanner;

public class Date {
    int ngay;
    int thang;
    int nam;

    // ========== CONSTRUCTOR ==========
    Date() {
        ngay = 1;
        thang = 1;
        nam = 1900;
    }

    Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // ========== GETTER/SETTER ==========
    void setNgay(int ngay) {
        this.ngay = ngay;
    }

    int getNgay() {
        return ngay;
    }

    void setThang(int thang) {
        this.thang = thang;
    }

    int getThang() {
        return thang;
    }

    void setNam(int nam) {
        this.nam = nam;
    }

    int getNam() {
        return nam;
    }

    void nhapDate() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = ip.nextInt();
        System.out.print("Nhap thang: ");
        thang = ip.nextInt();
        System.out.print("Nhap nam: ");
        nam = ip.nextInt();
    }

    void xuatDate(){
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

}
