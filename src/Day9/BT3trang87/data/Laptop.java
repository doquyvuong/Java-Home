package Day9.BT3trang87.data;

import java.util.regex.Pattern;

public class Laptop implements Comparable<Laptop> {
    private String Laptop_ID,name,country;
    private float price;

    public Laptop() {
    }

    public Laptop(String laptop_ID, String name, String country, float price) {
        Laptop_ID = laptop_ID;
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public String getLaptop_ID() {
        return Laptop_ID;
    }

    public void setLaptop_ID(String laptop_ID) {
        Laptop_ID = laptop_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String customName(String nameInput) {
        isEmpty(nameInput,"Tên Laptop không được bỏ trống");
        return nameInput ;
    }

    public String customCountry(String countryInput) {
        isEmpty(countryInput,"Quốc gia không được bỏ trống");
        countryInput = standardizeCountry(countryInput);
        return countryInput ;
    }

    public boolean customID(String valueID){
        String customPattern = "^[LN]\\d{3}\\[\\d{2}\\]$";
        return Pattern.matches(customPattern, valueID);
    }

    public void isEmpty(String value, String message){
        if (value.isEmpty()) {
            System.out.println(message);
        }
    }

    public String standardizeCountry(String input) {
        String replaceCountry = null;
        if(input.equals("VN")){
            replaceCountry = input.replace("VN","Việt Nam");
        }
        if(input.equals("CHN")){
            replaceCountry = input.replace("CHN","Trung Quốc");
        }
        return replaceCountry;
    }


    @Override
    public String toString() {
        return String.format("%10s%20s%20s%20s",Laptop_ID, name, country,price);
    }

    @Override
    public int compareTo(Laptop o) {
        return 0;
    }


}
