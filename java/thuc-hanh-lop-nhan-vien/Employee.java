/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author dimanche
 */
public class Employee {

    String ho;
    String ten;

    Date ngaySinh;
    Date ngayVaoLam;

    int soNgayLam;
    double heSoLuong;

    // ========== CONTRUCTOR ==========
    public Employee() {
    }

    public Employee(String ho, String ten, Date ngaySinh, Date ngayVaoLam) {
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
    }

    // ========== GETTER/SETTER ==========
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    // ========== NHAP/XUAT NHAN VIEN ==========
    public void nhapNhanVien() {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap ho: ");
        ho = ip.next();

        System.out.print("Nhap ten: ");
        ten = ip.next();

        ngaySinh = new Date();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh.nhapDate();

        ngayVaoLam = new Date();
        System.out.print("Nhap ngay vao lam: ");
        ngayVaoLam.nhapDate();

        System.out.print("Nhap ngay lam: ");
        soNgayLam = ip.nextInt();

        System.out.print("Nhap he so luong: ");
        heSoLuong = ip.nextDouble();

    }

    public void xuatNhanVien() {
        System.out.println("----------");

        System.out.println("Thong tin nhan vien vua nhap");
        System.out.println("Ho va ten: " + ho + " " + ten);
        System.out.println("Ngay sinh: ");
        ngaySinh.xuatDate();
        System.out.println("Ngay vao lam: ");
        ngayVaoLam.xuatDate();

    }

    public double luongThang() {
        return soNgayLam * heSoLuong;
    }
}
