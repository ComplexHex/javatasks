package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Solution.strings = new ArrayList<>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        //ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            Solution.strings.add(s);
        }
        int max = 0;

        for (int i = 0; i < Solution.strings.size(); i++) {
            if (Solution.strings.get(i).length() > max) {
                max = Solution.strings.get(i).length();
            }
        }
        //System.out.println(max);

        for (int i = 0; i < Solution.strings.size(); i++) {
            if (Solution.strings.get(i).length() == max) {
                System.out.println(Solution.strings.get(i));
            }

        }
    }
}