package com.pluralsight;

import java.sql.SQLOutput;

public class Menu {
    public static void main(String[] args) {

        // call the displayMeny method twice
        displayMenu();
        displayMenu();

    }

    //create a method that prints the Menu
    public static void displayMenu(){
        System.out.println("""
                === MENU ===\s
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99
                  
                  """);
    }
}
