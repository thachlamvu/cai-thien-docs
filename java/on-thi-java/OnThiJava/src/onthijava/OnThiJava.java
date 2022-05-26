/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onthijava;

/**
 *
 * @author dimanche
 */
/**
 * Câu 2: Viết lớp sinh viên bao gồm: Họ tên, giới tính, ngày sinh, điểm ba môn
 * và số tín chỉ từng môn. Viết lớp Date định dạng ngày sinh và kiểm tra tính
 * hợp lệ. Viết lớp điểm tính điểm trung bình học kỳ ba môn học và kiểm tra tính
 * hợp lệ.
 */
public class OnThiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv = new SinhVien();
        sv.nhapSinhVien();
        sv.xuatSinhVien();
    }

}
