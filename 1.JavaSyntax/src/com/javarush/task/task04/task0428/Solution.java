package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Положительное число
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


        int num = Integer.parseInt(sAge);
        int num1 = Integer.parseInt(sAge1);
        int num2 = Integer.parseInt(sAge2);

        if (num > 0 && num1 > 0 && num2 > 0) {
            System.out.println(3);
        }
        if (num <= 0 && num1 > 0 && num2 > 0 || num > 0 && num1 <= 0 && num2 > 0 || num > 0 && num1 > 0 && num2 <= 0) {
            System.out.println(2);
        }
        if (num <= 0 && num1 <= 0 && num2 > 0 || num > 0 && num1 <= 0 && num2 <= 0 || num <= 0 && num1 > 0 && num2 <= 0) {
            System.out.println(1);
        }
        if (num <= 0 && num1 <= 0 && num2 <= 0) {
            System.out.println(0);
        }
    }
}
