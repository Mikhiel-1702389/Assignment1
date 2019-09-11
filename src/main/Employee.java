package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee extends User {

    public Employee() {
    }

    public Employee(String id, String name) {
        super(id, name);
    }

    @Override
    public Reservation searchRoomNumber(int roomNumber) {
        File f;
        Scanner s;
        Reservation temp = null;
        try {
            f = new File("customerData.txt");
            s = new Scanner(f);
            boolean found = false;
            while (s.hasNext() && !found){
                String roomType = s.next();

                String firstName = s.next();
                String lastName = s.next();
                String name = firstName + " " + lastName;

                int number = s.nextInt();

                int duration = s.nextInt();

                temp = new Reservation(roomType, name, number, duration);

                if(temp.roomNumber == roomNumber){
                    found = true;
                }
            }

            if(!found){
                temp = new Reservation();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return temp;
    }

    @Override
    public Reservation searchReservationName(String name) {
        File f;
        Scanner s;
        Reservation temp = null;
        try {
            f = new File("customerData.txt");
            s = new Scanner(f);
            boolean found = false;
            while (s.hasNext() && !found){
                String roomType = s.next();

                String firstName = s.next();
                String lastName = s.next();
                String reservationName = firstName + " " + lastName;

                int number = s.nextInt();

                int duration = s.nextInt();

                temp = new Reservation(roomType, reservationName, number, duration);

                if(temp.name == name){
                    found = true;
                }
            }

            if(!found){
                temp = new Reservation();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return temp;
    }
}
