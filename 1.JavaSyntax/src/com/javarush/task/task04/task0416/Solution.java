package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();
        double time = Double.parseDouble(sAge);
       /* for (double i = 0; i < 60; i+=5.0) {
            if (time > 0 && time < 3 || time >= 5+i && time < 8+i) {
                System.out.println("зелёный");
                break;
            } else if (time >= 3+i && time < 4+i) {
                System.out.println("жёлтый");
                break;
            } else if (time >= 4+i && time < 5+i) {
                System.out.println("красный");
               break;
            }
        }*/
        if (time % 5 >= 0 && time % 5 < 3)
            System.out.println("зеленый");
        else {
            if(time % 5 >= 3 && time % 5 < 4)
                System.out.println("желтый");
            else
                System.out.println("красный");
        }


    }
}