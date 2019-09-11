package main;

public class Reservation {
    String roomType;
    String name;
    int roomNumber;
    int duration;


    public Reservation() {
        this.roomType = "";
        this.name = "";
        this.roomNumber = -1;
        this.duration = 0;
    }

    public Reservation(String roomType, String name, int roomNumber, int duration) {
        this.roomType = roomType;
        this.name = name;
        this.roomNumber = roomNumber;
        this.duration = duration;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.roomType + "\t" + this.name + "\t" + this.roomNumber + "\t" + this.duration;
    }
}
