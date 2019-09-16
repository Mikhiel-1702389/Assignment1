package main;

public class Customer extends User {

    public Customer() {
    }

    public Customer(String id, String name) {
        super(id, name);
    }

    @Override
    public House searchHouse(int id) {
        return null;
    }

}
