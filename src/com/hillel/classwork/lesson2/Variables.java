package com.hillel.classwork.lesson2;

public class Variables {

    public static void main(String[] args) {

        byte myByte = 101;
        System.out.println(myByte);

        short myShort = 30000;
        System.out.println(myShort);


        int myInt = 83643946;
        System.out.println(myInt);

        long myLong = 10099383736L;
        System.out.println(myLong);


        float myFloat =  36.9843F;
        System.out.println(myFloat);

        double myDouble = 98573598598.345678934567;
        System.out.println(myDouble);

        boolean isValid = false;
        System.out.println(isValid);

        char myChar = '#';
        System.out.println(myChar);

        char myNumericChar = 0;
        System.out.println(myNumericChar);

        char ch3 = '\u0001';
        System.out.println(ch3);

        String string = "test";
        System.out.println(string);

        long result = myInt + myLong;
        System.out.print(myInt + "+" + myLong + "=");
        System.out.println(result);
    }
}
