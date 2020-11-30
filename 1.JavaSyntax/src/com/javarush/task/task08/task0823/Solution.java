package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        for (Matcher m; (m = Pattern.compile("\\W?\\b[а-я]").matcher(string)).find();
             string = m.replaceFirst(m.group().toUpperCase()));
        System.out.println(string);
    }
}
