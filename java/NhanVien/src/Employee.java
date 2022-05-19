import java.util.Scanner;

public class Employee {
    String ho;
    String ten;
    Date ngaySinh;
    Date ngayVaoLam;

    Employee() {

    }

    Employee(String ho, String ten, Date ngaySinh, Date ngayVaoLam) {
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
    }

    // ========== NHAP/XUAT NHAN VIEN ==========
    void nhapNhanVien() {
        Scanner ip = new Scanner(System.in);

        ngaySinh = new Date();
        ngayVaoLam = new Date();

        System.out.println("Nhap thong tin nhan vien: ");
        System.out.print("Nhap ho nhan vien: ");
        ho = ip.next();
        System.out.print("Nhap ten nhan vien: ");
        ten = ip.next();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh.nhapDate();
        System.out.print("Nhap ngay vao lam: ");
        ngayVaoLam.nhapDate();
    }

    void xuatNhanVien() {
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ho ten nhan vien: " + ho + " " + ten);
        System.out.print("Ngay sinh: ");
        ngaySinh.xuatDate();
        System.out.print("Ngay vao lam: ");
        ngayVaoLam.xuatDate();
    }

}
