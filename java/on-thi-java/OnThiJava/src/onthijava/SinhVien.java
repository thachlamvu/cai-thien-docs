/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onthijava;

import java.util.Scanner;

/**
 *
 * @author dimanche
 */
public class SinhVien {

    String ho;
    String ten;
    String gioiTinh;
    Date ngaySinh; // Goi tu lop Date.java

    double diem1;
    double diem2;
    double diem3;

    int tinChi1;
    int tinChi2;
    int tinChi3;

    //    CONSTRUCTOR - Ham khoi tao khong tham so
    public SinhVien() {
    }

    //    CONSTRUCTOR - Ham khoi tao co tham so
    public SinhVien(String ho, String ten, String gioiTinh, Date ngaySinh, double diem1, double diem2, double diem3, int tinChi1, int tinChi2, int tinChi3) {
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tinChi1 = tinChi1;
        this.tinChi2 = tinChi2;
        this.tinChi3 = tinChi3;
    }

    //    GETTER/SETTER
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public int getTinChi1() {
        return tinChi1;
    }

    public void setTinChi1(int tinChi1) {
        this.tinChi1 = tinChi1;
    }

    public int getTinChi2() {
        return tinChi2;
    }

    public void setTinChi2(int tinChi2) {
        this.tinChi2 = tinChi2;
    }

    public int getTinChi3() {
        return tinChi3;
    }

    public void setTinChi3(int tinChi3) {
        this.tinChi3 = tinChi3;
    }

//    NHAP THONG TIN SINH VIEN
    public void nhapSinhVien() {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap ho: ");
        ho = ip.next();
        System.out.print("Nhap ten: ");
        ten = ip.next();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = ip.next();

        ngaySinh = new Date();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh.nhapDate();

        do {
            System.out.print("Nhap diem mon 1: ");
            diem1 = ip.nextDouble();
            System.out.print("Nhap tin chi mon 1: ");
            tinChi1 = ip.nextInt();
        } while ((diem1 < 0 || diem1 > 10) && tinChi1 < 0);

        do {
            System.out.print("Nhap diem mon 2: ");
            diem2 = ip.nextDouble();
            System.out.print("Nhap tin chi mon 2: ");
            tinChi2 = ip.nextInt();
        } while ((diem2 < 0 || diem2 > 10) && tinChi2 < 0);

        do {
            System.out.print("Nhap diem mon 3: ");
            diem3 = ip.nextDouble();
            System.out.print("Nhap tin chi mon 3: ");
            tinChi3 = ip.nextInt();
        } while ((diem3 < 0 || diem3 > 10) && tinChi3 < 0);

    }

    //    TINH DIEM TRUNG BINH
    public double tinhDiemTrungBinh() {
        double tongDiem = (diem1 * tinChi1) + (diem2 * tinChi2) + (diem3 * tinChi3);
        int tongTinChi = tinChi1 + tinChi2 + tinChi3;
        return tongDiem / tongTinChi;
    }

//    XUAT THONG TIN SINH VIEN
    public void xuatSinhVien() {
        System.out.println("----------");
        System.out.println(ho + " " + ten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.print("Ngay sinh: ");
        ngaySinh.xuatDate();
        System.out.println("");

        System.out.println("Diem 3 mon: " + diem1 + ", " + diem2 + ", " + diem3);
        System.out.printf("Diem trung binh: %.3f", tinhDiemTrungBinh());

    }

}
