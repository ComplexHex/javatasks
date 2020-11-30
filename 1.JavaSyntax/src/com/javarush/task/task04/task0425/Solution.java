package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        String sAge1 = bufferedReader.readLine();


        int num = Integer.parseInt(sAge);
        int num1 = Integer.parseInt(sAge1);


        if (num > 0 && num1 > 0) {
            System.out.println(1);
        }
        if (num < 0 && num1 > 0) {
            System.out.println(2);
        }
        if (num < 0 && num1 < 0) {
            System.out.println(3);
        }if (num > 0 && num1 < 0) {
            System.out.println(4);
        }



    }
}
