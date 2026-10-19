package com.pluralsight;

public class Format {
    public static void main(String[] args) {

    // Stored a method in a variable and printed it
    String formattedName = formatName("Logan","Simba");
    System.out.println(formattedName);

    }

    //create a formate name method
    public static String formatName(String first, String last){
        return last + ", " + first;
    }
}
