package DAY11;

public class Lop {
    private String MALOP;
    private String TENLOP;
    private int SISO;

    public Lop() {
    }

    public Lop(String MALOP, String TENLOP, int SISO) {
        this.MALOP = MALOP;
        this.TENLOP = TENLOP;
        this.SISO = SISO;
    }

    public String getMALOP() {
        return MALOP;
    }

    public void setMALOP(String MALOP) {
        this.MALOP = MALOP;
    }

    public String getTENLOP() {
        return TENLOP;
    }

    public void setTENLOP(String TENLOP) {
        this.TENLOP = TENLOP;
    }

    public int getSISO() {
        return SISO;
    }

    public void setSISO(int SISO) {
        this.SISO = SISO;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "MALOP='" + MALOP + '\'' +
                ", TENLOP='" + TENLOP + '\'' +
                ", SISO=" + SISO +
                '}';
    }
}
