package Day9.BT4trang88.data;


public class Doctor {
    private String id;
    private String name;
    private int availHours;

    public Doctor() {}


    public Doctor(String id, String name, int availHours) {
        this.id = id;
        this.name = name;
        this.availHours = availHours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailHours() {
        return availHours;
    }

    public void setAvailHours(int availHours) {
        this.availHours = availHours;
    }

    @Override
    public String toString() {
        return String.format("%10s%20s%20s",id, name, availHours);
    }

}


