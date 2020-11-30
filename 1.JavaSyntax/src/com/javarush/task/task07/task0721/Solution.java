package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        int[] array = getInts();

        for (int i = 0; i < array.length; i++) {
            {
                if (array[i] > maximum)
                    maximum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            {
                if (array[i] < minimum)
                    minimum = array[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        return list;
    }
}
