package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;


    static {
try {BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name;
    String name1;

    name = reader.readLine();
    name1 = reader.readLine();

    A = (Integer.parseInt(name));
    B = (Integer.parseInt(name1));
} catch (IOException e) {
    e.printStackTrace();
}

    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
