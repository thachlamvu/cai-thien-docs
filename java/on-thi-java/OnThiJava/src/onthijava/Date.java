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
public class Date {

    int ngay;
    int thang;
    int nam;

//    CONSTRUCTOR - Ham khoi tao voi 3 tham so
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
//    CONSTRUCTOR - Ham khoi tao voi gia tri mac dinh la 1/1/1900

    public Date() {
        ngay = 1;
        thang = 1;
        nam = 1900;
    }

//    GETTER/SETTER
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

//    NHAP DATE
    public void nhapDate() {
        Scanner ip = new Scanner(System.in);

        do {
            System.out.print("\nNhap ngay: ");
            ngay = ip.nextInt();
            System.out.print("Nhap thang: ");
            thang = ip.nextInt();
            System.out.print("Nhap nam: ");
            nam = ip.nextInt();

        } while (!kiemTraDateHopLe());
    }

    //    XUAT DATE theo dinh dang ngay/thang/nam
    public void xuatDate() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    //    KIEM TRA DATE HOP LE
    public boolean kiemTraDateHopLe() {
        if (ngay < 1 || ngay > 31) {
            return false;
        }

        if (thang < 1 || thang > 12) {
            return false;
        }

        if (nam < 2022) {
            return false;
        }

        return true;
    }

}
