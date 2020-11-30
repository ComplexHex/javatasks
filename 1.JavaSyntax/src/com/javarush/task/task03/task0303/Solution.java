package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(12, 15));
        System.out.println(convertEurToUsd(13, 12));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double Usd;
        Usd = eur * exchangeRate;
        return Usd;
    }
}
