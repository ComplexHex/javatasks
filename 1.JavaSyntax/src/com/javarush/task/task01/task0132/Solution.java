package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int DigitsInNumber = 0;
        int s;
        int s1;
        int s2;
        s = number % 10;
        s1 = ((number - s)/10) % 10;
        s2 = ((number - s - (s1*10))/100) % 10;
        DigitsInNumber = s + s1 + s2;


        return DigitsInNumber;

    }
}