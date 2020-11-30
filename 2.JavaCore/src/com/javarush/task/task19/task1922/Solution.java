package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(r.readLine()));
        //   BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\IMAST\\Desktop\\New.txt"));


        while (reader.ready()) {
            String line1 = reader.readLine();
            int count = 0;
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(line1.split(" ")));
            for (String s : words) count += Collections.frequency(arrayList, s);
            if (count == 2) {
                System.out.println(line1);
            }
        }
        r.close();
        reader.close();
    }
}
