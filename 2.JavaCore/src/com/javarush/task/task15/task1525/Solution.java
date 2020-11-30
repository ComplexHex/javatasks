package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
       // for (String s : lines)
            System.out.println(lines);
    }

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            while (reader.ready()) {
    String str = reader.readLine();
    lines.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
