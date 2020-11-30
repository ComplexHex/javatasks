package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int Max = 0;
        int Min = 0;

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> length = new ArrayList<Integer>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);


        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < 10; i++) {
            length.add(list.get(i).length());
        }
        for (int i = 0; i < 10; i++) {

            Max = length.indexOf(Collections.max(length));
            Min = length.indexOf(Collections.min(length));
        }
        if (Max > Min) {
            System.out.println(list.get(Min));
        } else System.out.println(list.get(Max));
    }
}
