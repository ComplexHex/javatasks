package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*      1. Программа должна считывать данные с клавиатуры.
        2. Программа должна вывести столько же строк, сколько было введено.
        3. Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
        4. Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
        5. Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку
        и нажмет Enter.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> listMult = new ArrayList<String>();
        for (String s :strings) {
            listMult.add(s.length() % 2 == 0 ? (s + " " + s) : (s + " " + s + " " + s));
        }
        listMult.forEach(System.out::println);
        }

    }

