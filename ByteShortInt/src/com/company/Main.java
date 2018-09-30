package com.company;

public class Main {

    public static void main(String[] args) {
        // -2,147,483,648 to 2,147,483,647, 2^31
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);

        // -128 to 127, 2^7
        // takes 1/4 space of an int
        // byte has a width of 8
        // expressions automatically convert to int unless otherwise specified
        byte myByteValue = -120;
        byte myNewByteValue = (byte)(myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // -32,768 to 32,767, 2^15
        // takes 1/2 space of int, 2x space of byte
        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("myNewShortValue = " + myShortValue);

        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, 2^63
        // add lowercase or uppercase L at end of value to show Long
        // long has a width of 64

        long myLongValue = 9_223_372_036_854_775_807L;

        //Exercise
        // 1. Create byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short plus the int

        byte testByte = 100;
        short testShort = 1000;
        int testInt = 10000;
        long testLong = (long) 50_000 + (10 * (testByte + testShort + testInt));
        System.out.println(testLong);;
    }
}
