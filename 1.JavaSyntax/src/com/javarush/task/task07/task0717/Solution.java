package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> list = new ArrayList<>();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result

        for (String s : result) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код

        int size = list.size() * 2;
        for (int i = 0; i < size; i += 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}

/*else if (strings.get(i).contains("л")) {
        strings1.add(strings.get(i));
        strings1.add(strings.get(i));*/
