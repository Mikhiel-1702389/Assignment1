package main;

public class House {
    int id;
    float price;
    String location;
    String advertiser;
    Photo image;


    public House() {
        this.id = 0;
        this.price = 0;
        this.location = "";
        this.advertiser = "";
    }

    public House(int id, float price, String location, String advertiser) {
        this.id = id;
        this.price = price;
        this.location = location;
        this.advertiser = advertiser;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.price + "\t" + this.location + "\t" + this.advertiser;
    }
}
