package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Сортировка трех чисел
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



        int max ;
        int min;
        int centr = 0;


        max = Math.max(Math.max(num, num1), num2);
        min = Math.min(Math.min(num, num1), num2);
        centr = num + num1 + num2 - max - min;

      /*  if (max != num && min != num1 ){
            centr = num2;}

        if (max != num1 && min != num2 ){
            centr = num;}

        if (max != num && min != num2 ){
            centr = num1;}*/

        System.out.println(max + " " + centr + " " + min);
    }
}
