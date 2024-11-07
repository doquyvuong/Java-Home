package DAY11;

import java.util.BitSet;

public class Monhoc {
    private String MSMH;
    private String TENMH;
    private int SOTINCHI;
    private int TINHCHAT;

    public Monhoc() {
        this.SOTINCHI = 3;
    }

    public Monhoc(String MSMH, String TENMH, int SOTINCHI, int TINHCHAT) {
        this.MSMH = MSMH;
        this.TENMH = TENMH;
        this.SOTINCHI = SOTINCHI;
        this.TINHCHAT = TINHCHAT;
    }

    public String getMSMH() {
        return MSMH;
    }

    public void setMSMH(String MSMH) {
        this.MSMH = MSMH;
    }

    public String getTENMH() {
        return TENMH;
    }

    public void setTENMH(String TENMH) {
        this.TENMH = TENMH;
    }

    public int getSOTINCHI() {
        return SOTINCHI;
    }

    public void setSOTINCHI(int SOTINCHI) {
        this.SOTINCHI = SOTINCHI;
    }

    public int getTINHCHAT() {
        return TINHCHAT;
    }

    public void setTINHCHAT(int TINHCHAT) {
        this.TINHCHAT = TINHCHAT;
    }

    @Override
    public String toString() {
        return "Monhoc{" +
                "MSMH='" + MSMH + '\'' +
                ", TENMH='" + TENMH + '\'' +
                ", SOTINCHI=" + SOTINCHI +
                ", TINHCHAT=" + TINHCHAT +
                '}';
    }
}
