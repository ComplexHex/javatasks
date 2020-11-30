package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            String s = reader.readLine();
            numbers[i] = Integer.parseInt(s);
        }
        // for (int i = numbers.length; i > 0; i--)
        for (int i = numbers.length - 1; i > -1; i--)
            System.out.println(numbers[i]);
    }
}

