package DAY11;


public class BangDiem {
    private String MSSV;
    private String MSMH;
    private double DiemThi;

    public BangDiem() {
    }

    public BangDiem(String MSSV, String MSMH, double diemThi) {
        this.MSSV = MSSV;
        this.MSMH = MSMH;
        DiemThi = diemThi;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMSMH() {
        return MSMH;
    }

    public void setMSMH(String MSMH) {
        this.MSMH = MSMH;
    }

    public double getDiemThi() {
        return DiemThi;
    }

    public void setDiemThi(double diemThi) {
        DiemThi = diemThi;
    }

    @Override
    public String toString() {
        return "BangDiem{" +
               "MSSV='" + MSSV + '\'' +
               ", MSMH='" + MSMH + '\'' +
               ", DiemThi=" + DiemThi +
               '}';
    }
}
