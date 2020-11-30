package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();
        String sAge1 = bufferedReader.readLine();
        String sAge2 = bufferedReader.readLine();
        int num1 = Integer.parseInt(sAge);
        int num2 = Integer.parseInt(sAge1);
        int num3 = Integer.parseInt(sAge2);

        if (num1 == num2 && num1 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 == num2) {
            System.out.println(num1 + " " + num2);
        } else if (num1 == num3) {
            System.out.println(num1 + " " + num3);
        } else if (num2 == num3) {
            System.out.println(num2 + " " + num3);
        }


    }
}