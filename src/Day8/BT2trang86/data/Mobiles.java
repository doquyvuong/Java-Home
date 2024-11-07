package Day8.BT2trang86.data;

public class Mobiles {
    private String mobile_ID,model,color;
    private float price;

    public Mobiles() {
    }

    public Mobiles(String mobile_ID, String model, String color, float price) {
        this.mobile_ID = mobile_ID;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getMobile_ID() {
        return mobile_ID;
    }

    public void setMobile_ID(String mobile_ID) {
        this.mobile_ID = mobile_ID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%10s%20s%20s%20s",mobile_ID, model, color,price);
    }
}
