package com.hillel.homework;

public class Homework3 {
    public static void main(String[] args) {


        //основные числа
        int a = 20;
        int b = 5;
        // степень
        int i = 3;
        //квадратный корень
        int c = 4;

        System.out.print("|" + a + "-" + b + "|" + ":" + "(" + a + "+" + b + ")" + "^" + i +  "-" + "√" + c + "=");

        //основное число 1 + основное число 2
        int ab = a - b;
        //степени
        double a1 = (Math.pow( a + b, i));

        //модуль
        int ab1 = (Math.abs(ab));
        //модуль/степень
        double a1b2 = ab1 / a1;
        //квадратный корень
        double abab = Math.sqrt(c);
        //модуль/степень-квадратный корень
        double a2b2 = a1b2 - abab;
        //решение
        System.out.println(a2b2);



    }
}
