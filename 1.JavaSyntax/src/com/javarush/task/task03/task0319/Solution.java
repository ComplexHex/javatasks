package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String sAge1 = bufferedReader.readLine();
        String sAge2 = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge1);

        System.out.println(name+ " получает " + sAge1 + " через " + sAge2 + " лет.");



    }
}
