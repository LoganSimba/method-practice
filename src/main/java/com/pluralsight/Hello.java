package com.pluralsight;

public class Hello {

    public static void main(String[] args) {

        sayHello();
        sayGodBye();
        sayGoodMorning();

    }

    // creating void method that prints a message
    public static void sayHello(){
        System.out.println("Hello, world!");

    }

    // creating a methof that prints a goodbye messge
    public static void sayGodBye(){
        System.out.println("Goodbye!");
    }


    //add a good morning method
    public static void sayGoodMorning(){
        System.out.println("Good Morning!");
    }

}
