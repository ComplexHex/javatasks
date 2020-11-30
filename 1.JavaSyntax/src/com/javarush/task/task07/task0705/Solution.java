package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            String s = reader.readLine();
            numbers[i] = Integer.parseInt(s);
        }
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];

        System.arraycopy(numbers, 0, numbers1, 0, 10);
        System.arraycopy(numbers, 10, numbers2, 0, 10);

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }

}


