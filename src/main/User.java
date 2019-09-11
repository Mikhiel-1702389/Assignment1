package main;

import java.io.FileWriter;
import java.io.IOException;

public abstract class User {
    private String id;
    private String name;

    public User() {
        this.id = "";
        this.name = "";
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
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

    public void writeData(Reservation reservationInfo){
        FileWriter f = null;
        try {
            f = new FileWriter("customerData.txt", true);
            f.append(reservationInfo.toString() + "\n");
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

    public abstract Reservation searchRoomNumber(int roomNumber);

    public abstract Reservation searchReservationName(String name);
}
