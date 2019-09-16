package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Employee extends User {

    public Employee() {
    }

    public Employee(String id, String name) {
        super(id, name);
    }


    @Override
    public House searchHouse(int id) {
        File f;
        Scanner s;
        House temp = null;
        try {
            f = new File("customerData.txt");
            s = new Scanner(f);
            boolean found = false;
            while (s.hasNext() && !found){
                float price = s.nextInt();

                String location = s.next();

                String Street = s.next();
                String Parish = s.next();
                String advertiser = Street + " " + Parish;

                temp = new House(id, price, location, advertiser);


                if(temp.id == id){
                    found = true;
                }
            }

            if(!found){
                temp = new House();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return temp;
    }
}
