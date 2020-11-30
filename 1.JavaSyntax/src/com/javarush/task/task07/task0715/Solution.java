package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        String[] s = {"мама", "мыла", "раму"};

        ArrayList<String> imenno = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
            imenno.add(s[i]);
        }
        imenno.add(1, "именно");
        imenno.add(3, "именно");
        imenno.add(5, "именно");

        for (int i = 0; i < imenno.size(); i++) {
            System.out.println(imenno.get(i));
        }
    }
}
