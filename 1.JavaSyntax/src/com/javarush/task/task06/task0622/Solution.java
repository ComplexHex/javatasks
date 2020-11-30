package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge1 = bufferedReader.readLine();
        String sAge2 = bufferedReader.readLine();
        String sAge3 = bufferedReader.readLine();
        String sAge4 = bufferedReader.readLine();
        String sAge5 = bufferedReader.readLine();
        int year1 = Integer.parseInt(sAge1);
        int year2 = Integer.parseInt(sAge2);
        int year3 = Integer.parseInt(sAge3);
        int year4 = Integer.parseInt(sAge4);
        int year5 = Integer.parseInt(sAge5);
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(year1);
        arrayList.add(year2);
        arrayList.add(year3);
        arrayList.add(year4);
        arrayList.add(year5);


        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
