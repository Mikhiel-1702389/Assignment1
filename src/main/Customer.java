package main;

public class Customer extends User {

    public Customer() {
    }

    public Customer(String id, String name) {
        super(id, name);
    }

    @Override
    public Reservation searchRoomNumber(int roomNumber) {
        return null;
    }

    @Override
    public Reservation searchReservationName(String name) {
        return null;
    }
}
