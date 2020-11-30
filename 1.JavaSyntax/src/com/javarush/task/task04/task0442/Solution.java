package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);



        //int num = Integer.parseInt(sAge);
       int sum = 0;

        while (true) {
            String sAge = bufferedReader.readLine();
            int num = Integer.parseInt(sAge);
            sum += num;

            if (num == -1)
                break;
        }
        System.out.println(sum);

    }
}
