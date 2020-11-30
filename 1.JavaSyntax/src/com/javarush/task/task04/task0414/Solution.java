package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.GregorianCalendar;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();
        int year = Integer.parseInt(sAge);

        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        if (cal.isLeapYear(year) == true) {
            System.out.println("количество дней в году: 366");
        } else System.out.println("количество дней в году: 365");


    }
}