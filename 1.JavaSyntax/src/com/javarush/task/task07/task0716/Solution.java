package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> strings1 = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р") && strings.get(i).contains("л")) {
                strings1.add(strings.get(i));
            } else if (strings.get(i).contains("л")) {
                strings1.add(strings.get(i));
                strings1.add(strings.get(i));
            } else if (strings.get(i).contains("р")) {
            } else strings1.add(strings.get(i));
        }

        return strings1;
    }
}

