package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Правило треугольника
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
        int side = Integer.parseInt(sAge);
        int side1 = Integer.parseInt(sAge1);
        int side2 = Integer.parseInt(sAge2);

        if ((side + side1) > side2 && (side + side2) > side1 && (side1 + side2) > side){
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }

    }
}