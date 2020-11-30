package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];

        for (int i = 0; i < numbers.length; i++) {
            String s = reader.readLine();
            numbers[i] = Integer.parseInt(s);
        }
        int evenS = 0;
        for (int i = 0; i <= 14; i = i + 2) {
            evenS += numbers[i];
        }
        int notEven = 0;
        for (int i = 1; i <= 13; i = i + 2) {
            notEven += numbers[i];
        }
        if (evenS > notEven) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}

