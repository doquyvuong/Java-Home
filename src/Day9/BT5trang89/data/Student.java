package Day9.BT5trang89.data;

public class Student {
    private String stuID;
    private String stuName;
    private String phone;
    private String address;

    public Student(String stuID, String stuName, String phone, String address) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.phone = phone;
        this.address = address;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%10s%20s%20s%20s",stuID,stuName,phone,address);
    }
}
