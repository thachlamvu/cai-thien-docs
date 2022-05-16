import java.util.Scanner;

public class SinhVien {
    int maSo;
    String hoTen;
    String diaChi;

    int soMonHoc;
    String monHoc[];
    int tinChi[];
    double diemMonHoc[];
    double diemTrungBinh;

    // ========== CONTRUCTOR ==========
    SinhVien() {

    }

    SinhVien(int maSo, String hoTen, String diaChi, int soMonHoc, String monHoc[], int tinChi[], double diemMonHoc[],
            double diemTrungBinh) {
        monHoc = new String[soMonHoc];
        diemMonHoc = new double[soMonHoc];
        tinChi = new int[soMonHoc];

        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diaChi = diaChi;

        this.soMonHoc = soMonHoc;
        this.monHoc = monHoc;
        this.tinChi = tinChi;

        this.diemMonHoc = diemMonHoc;
        this.diemTrungBinh = diemTrungBinh;
    }

    // ========== GETTER/SETTER ==========
    void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    void setSoMonHoc(int soMonHoc) {
        this.soMonHoc = soMonHoc;
    }

    void setMonHoc(String monHoc[]) {
        this.monHoc = monHoc;

    }

    void setTinChi(int tinChi[]) {
        this.tinChi = tinChi;
    }

    void setDiemMonHoc(double diemMonHoc[]) {
        this.diemMonHoc = diemMonHoc;
    }

    void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    int getMaSo() {
        return maSo;
    }

    String getHoTen() {
        return hoTen;
    }

    String getDiaChi() {
        return diaChi;
    }

    int getSoMonHoc() {
        return soMonHoc;
    }

    String[] getMonHoc() {
        return monHoc;
    }

    int[] getTinChi() {
        return tinChi;
    }

    double[] getDiemMonHoc() {
        return diemMonHoc;
    }

    double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    // ========== NHAP THONG TIN SINH VIEN ==========
    void nhapThongTinSV() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap MSSV: ");
        maSo = ip.nextInt();
        System.out.print("Nhap ho ten: ");
        hoTen = ip.next();
        System.out.print("Nhap dia chi: ");
        diaChi = ip.next();

        do {
            System.out.print("Nhap so mon hoc: ");
            soMonHoc = ip.nextInt();
        } while (soMonHoc <= 0);

        diemMonHoc = new double[soMonHoc];
        tinChi = new int[soMonHoc];
        monHoc = new String[soMonHoc];

        for (int i = 0; i < soMonHoc; i++) {
            do {
                System.out.print("Nhap ten mon hoc [" + (i + 1) + "]: ");
                monHoc[i] = ip.next();
                System.out.print("Nhap diem mon [" + (i + 1) + "]: ");
                diemMonHoc[i] = ip.nextDouble();
            } while (diemMonHoc[i] <= 0);

            do {
                System.out.print("Nhap so tin chi mon [" + (i + 1) + "]: ");
                tinChi[i] = ip.nextInt();
            } while (tinChi[i] <= 0);

        }
    }

    // ========== TINH DIEM TRUNG BINH MON ==========
    int tinhTongTinChi(){
        int tongTinChi = 0;
        for (int i = 0; i < soMonHoc; i++) {
            tongTinChi += tinChi[i];
        }

        return tongTinChi;
    }

    double tinhDiemTrungBinh() {
        double tongDiemCacMon = 0;
        int tongTinChi = 0;
        double diemTrungBinh;

        for (int i = 0; i < soMonHoc; i++) {
            tongDiemCacMon += diemMonHoc[i] * tinChi[i];
            tongTinChi += tinChi[i];
        }
        diemTrungBinh = tongDiemCacMon / tongTinChi;
        return diemTrungBinh;
    }

    // ========== NHAP/XUAT THONG TIN SINH VIEN ==========
    void xuatThongTinSV() {
        System.out.println("\n------------------------------");
        System.out.println("MSSV: " + maSo);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("So mon hoc: " + soMonHoc);
        System.out.println("\nChi tiet diem cac mon: ");

        System.out.println("------------------------------");
        for (int i = 0; i < soMonHoc; i++) {
            System.out.println(monHoc[i] + " \t| " + diemMonHoc[i]);
        }
        System.out.println("------------------------------");

        int ttc = tinhTongTinChi();
        System.out.println("Tong so tin chi = " + ttc);
        double dtb = tinhDiemTrungBinh();
        System.out.println("Diem trung binh = " + dtb);
    }

}
