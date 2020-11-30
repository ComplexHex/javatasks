package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);


        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        list.remove(2);

        for (int i = list.size()-1; i > -1; i--) {
            System.out.println(list.get(i));
        }
    }
}
