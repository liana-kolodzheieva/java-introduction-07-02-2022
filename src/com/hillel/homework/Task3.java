package com.hillel.homework;

public class Task3 {
    public static void main(String[] args) {
        int a = 155758;
        int b =4384232;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int a2 = a;
        a = b;
        b = a2;

        System.out.println("после обмена");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
