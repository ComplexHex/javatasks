package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<String, Double>();
       // BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\IMAST\\Desktop\\New.txt"));
         BufferedReader reader = new BufferedReader(new FileReader(args[0]));


        String line1;
        while ((line1 = reader.readLine()) != null) {
            String[] parts = line1.split(" ");
            map.merge(parts[0], Double.valueOf(parts[1]), (a, b) -> a + Double.valueOf(parts[1]));


        } reader.close();
        map.forEach((a, b) -> System.out.println(a + " " + b));
    }
}
