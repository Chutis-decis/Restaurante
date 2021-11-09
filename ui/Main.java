package ui;

import model.Person;
import model.User;
import model.Waiter;

public class Main {
    public static void main(String[] args) {
       User user = new User("chutis123j@gmail.com", "Luis Alfredo Garcia Sandoval ");
       
        System.out.println(user );
        user.Platillos();
    }
}
