public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rec = new Rectangle();
        rec.setLen(22);
        rec.setWid(22);
        rec.veHinhChuNhat('*');
        double duongCheo = rec.tinhDuongCheo();
        double chuVi = rec.tinhChuVi();
        double dienTich = rec.tinhDienTich();

        System.out.printf("\nDuong cheo hinh chu nhat = %.2f", duongCheo);
        System.out.printf("\nChu vi hinh chu nhat = %.2f", chuVi);
        System.out.printf("\nDien tich hinh chu nhat = %.2f", dienTich);
        System.out.println("");

    }
}
