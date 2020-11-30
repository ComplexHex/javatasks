package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();

        int day = Integer.parseInt(sAge);

        if (day == 1)
            System.out.println("понедельник");
        else if (day == 2)
            System.out.println("вторник");
        else if (day == 3)
            System.out.println("среда");
        else if (day == 4)
            System.out.println("четверг");
        else if (day == 5)
            System.out.println("пятница");
        else if (day == 6)
            System.out.println("суббота");
        else if (day == 7)
            System.out.println("воскресенье");
        else if (day < 1 || day > 7 ) {
            System.out.println("такого дня недели не существует");
        }
    }
}
