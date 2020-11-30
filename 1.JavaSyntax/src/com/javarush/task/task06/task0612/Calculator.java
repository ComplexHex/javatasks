package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int sum = a + b;

        return sum;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int min = a - b;

        return min;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int mult = a*b;
        return mult;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double div = a*1.0/b*1.0;
        return div;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double per = (a*1.0)*(b*1.0)/100;
        return (double) per;
    }

    public static void main(String[] args) {

    }
}