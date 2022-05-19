public class Rectangle {
    private int len;
    private int wid;

    // ========== CONSTRUCTOR ==========
    public Rectangle(int len, int wid) {
        if (len >= 0 && len <= 20) {
            this.len = len;
        } else {
            this.len = 10;
        }

        if (wid >= 0 && wid <= 20) {
            this.wid = wid;
        } else {
            this.wid = 10;
        }

    }

    public Rectangle() {
        len = 10;
        wid = 10;
    }

    // ========== GETTER/SETTER ==========
    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        if (len >= 0 && len <= 20) {
            this.len = len;
        } else {
            this.len = 10;
        }

    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        if (wid >= 0 && wid <= 20) {
            this.wid = wid;
        } else {
            this.wid = 10;
        }
    }

    // ========== TINH TOAN ==========
    // Tinh Chu Vi
    public double tinhChuVi() {
        double p = 2 * (len + wid);
        return p;
    }

    // Tinh Dien Tich
    public double tinhDienTich() {
        double s = len * wid;
        return s;
    }

    // Tinh Duong Cheo
    public double tinhDuongCheo() {
        double duongCheo = Math.sqrt(Math.pow(len, 2) + Math.pow(wid, 2));
        return duongCheo;
    }

    // ========== VE HINH ==========
    public void veHinhChuNhat(char c) {
        for (int i = 0; i < wid; i++) {
            System.out.println("");
            for (int j = 0; j < len; j++) {
                System.out.print(c + " ");
            }
        }
    }

    // ========== KIEM TRA HINH VUONG ==========
    public boolean kiemTraHinhVuong() {
        return wid == len;
    }

}
