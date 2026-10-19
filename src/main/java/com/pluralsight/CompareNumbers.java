package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {

        //print the method
        System.out.println(isEven(21));
        System.out.println(isPositive(-34));

        //store the method in a variable and print it
        boolean number = isEven(12);
        boolean positive = isPositive(45);

        System.out.println(number);
        System.out.println(positive);


    }

    // created a boolean method to check if a number is even
    public static boolean isEven(int num){

        return num % 2 == 0;
    }

    //create a method to check if a number is positive
    public static boolean isPositive(int num){
        return num > 0;
    }

}
