package DAY11;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Sinhvien {
    private String MSSV;
    private String HOTEN;
    private Date NGAYSINH;
    private List<Lop> MALOP = new ArrayList<>();
    private String GIOITINH;

    public Sinhvien() {
    }

    public Sinhvien(String MSSV, String HOTEN, Date NGAYSINH, List<Lop> MALOP, String GIOITINH) {
        this.MSSV = MSSV;
        this.HOTEN = HOTEN;
        this.NGAYSINH = NGAYSINH;
        this.MALOP = MALOP;
        this.GIOITINH = GIOITINH;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public List<Lop> getMALOP() {
        return MALOP;
    }

    public void setMALOP(List<Lop> MALOP) {
        this.MALOP = MALOP;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
               "MSSV='" + MSSV + '\'' +
               ", HOTEN='" + HOTEN + '\'' +
               ", NGAYSINH=" + NGAYSINH +
               ", MALOP=" + MALOP +
               ", GIOITINH='" + GIOITINH + '\'' +
               '}';
    }
}
