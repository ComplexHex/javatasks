package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int sum = 0;
        int count = 0;

        while (true) {
            String sAge = bufferedReader.readLine();
            int num = Integer.parseInt(sAge);
            sum += num;
            count++;
            if (num == -1)
                break;
        }
        System.out.println((float) (sum +1)/(count-1));
    }
}

