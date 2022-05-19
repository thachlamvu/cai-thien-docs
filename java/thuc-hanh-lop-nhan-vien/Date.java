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
public class Date {

    int ngay;
    int thang;
    int nam;

    // ========== CONTRUCTOR ==========
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public Date() {
        ngay = 1;
        thang = 1;
        nam = 1900;
    }

    // ========== GETTER/SETTER ==========
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    // ========== NHAP/XUAT DATE ==========
    public void nhapDate() {
        Scanner ip = new Scanner(System.in);
        do {
            System.out.print("Nhap ngay: ");
            ngay = ip.nextInt();

            System.out.print("Nhap thang: ");
            thang = ip.nextInt();

            System.out.print("Nhap nam: ");
            nam = ip.nextInt();
        } while (kiemTraNgay() == false);

    }

    public boolean kiemTraNgay() {
        if (ngay < 1 || ngay > 31) {
            return false;
        }

        if (thang < 1 || thang > 12) {
            return false;
        }

        if (nam < 1900) {
            return false;
        }

        return true;
    }

    public void xuatDate() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
}
