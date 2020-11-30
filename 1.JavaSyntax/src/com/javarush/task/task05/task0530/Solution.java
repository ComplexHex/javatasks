package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        String sAge1 = reader.readLine();

        int a = Integer.parseInt(sAge);
        int b = Integer.parseInt(sAge1);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
