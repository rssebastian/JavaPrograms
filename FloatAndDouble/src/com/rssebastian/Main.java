package com.rssebastian;

public class Main {

    public static void main(String[] args) {
        // width of 32 (4 bytes)
        int myIntValue = 5 / 2;

	    // add f after value to indicate float or add float in parenthesis
        // 7 digits of precision
        // width of 32 (4 bytes)
	    float myFloatValue = 5f / 3f;

	    // add d after value to indicate double
        // like expressions try to convert to int, decimal will convert to double
        // 16 digits of precision
        // width of 64 (8 bytes)
        // faster on modern computers
        // in-built functions in Java use doubles
        // more precise
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms

        int numPounds = 32;
        double numKilograms = (double) (numPounds * 0.45359237);
        System.out.println("Pounds in kilograms = " + numKilograms);

        // _ can also make number more readable
        double pi = 3.141_5927;
        System.out.println(pi);
    }
}
