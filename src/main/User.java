package main;

import java.io.FileWriter;
import java.io.IOException;

public abstract class User {
    private String name;

    public User() {
        this.name = "";
    }

    public User(String id, String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeData(House houseInfo){
        FileWriter f = null;
        try {
            f = new FileWriter("customerData.txt", true);
            f.append(houseInfo.toString() + "\n");
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            f.close();
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

    public abstract House searchHouse(int id);
}
