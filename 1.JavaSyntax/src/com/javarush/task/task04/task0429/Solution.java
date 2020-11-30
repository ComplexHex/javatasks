package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        int numberThree = Integer.parseInt(reader.readLine());

        int[] numbers = {numberOne, numberTwo, numberThree};

        int plus = 0;
        int minus = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) plus++;
            else if (numbers[i] < 0) minus++;
        }
        System.out.println("количество положительных чисел: " + plus);
        System.out.println("количество отрицательных чисел: " + minus);


    }
}

