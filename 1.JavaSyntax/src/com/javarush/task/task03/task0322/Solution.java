package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();


        System.out.println(name + " + " + name1 + " + " + name2 + " = Чистая любовь, да-да!");

    }
}