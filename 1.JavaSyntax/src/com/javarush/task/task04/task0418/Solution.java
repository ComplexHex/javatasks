package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        String sAge1 = bufferedReader.readLine();

        int integ = Integer.parseInt(sAge);
        int integ1 = Integer.parseInt(sAge1);


        if (integ >= integ1 ) {
            System.out.println(integ1);
        }
        else {
            System.out.println(integ);
        }
    }
}