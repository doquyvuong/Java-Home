package Day3;

public class NhanVien {
    private String maNV;
    private int soSP;

     NhanVien() {
    }

     boolean coVuotChuan() {
        return soSP>500;
    }

     NhanVien(String ma, int sp) {
        this.maNV = ma;
        setSoSP(sp);
    }

    String getMaNV() {
        return maNV;
    }
     void setMaNV(String ma) {
        this.maNV = ma;
    }

     int getSoSP() {
        return soSP;
    }
     void setSoSP(int sp) {
        if(sp > 0) {
            this.soSP = sp;
        }else {
            this.soSP = 0;
        }
    }

    String getTongKet() {
        return coVuotChuan() ? "'Vượt'" : "''";
    }

    double getLuong() {
        int spVuotChuan = soSP > 500 ? soSP - 500 : 0;
        int spKhongVuotChuan = soSP > 500 ? 500 : soSP;
        return spKhongVuotChuan * 20000 + spVuotChuan * 30000;
    }

    @Override
    public String toString() {
        return "maNV= " + maNV +
                ", soSP= " + soSP +
                ", luong nhan vien= " + getLuong() +
                ", Tong ket= " + getTongKet()  ;
    }
}
