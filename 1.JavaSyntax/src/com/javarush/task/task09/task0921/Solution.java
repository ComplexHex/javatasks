package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<Integer>();


        while (true) {
            try {
                String s = reader.readLine();
                num.add(Integer.parseInt(s));
            } catch (NumberFormatException | IOException e) {
                for (int c : num)
                System.out.println(c);
                break;
            }        }
    }
}
