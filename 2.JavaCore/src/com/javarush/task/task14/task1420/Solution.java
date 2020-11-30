package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();

        int a = (Integer.parseInt(name));
        int b = (Integer.parseInt(name1));

        if (a <= 0 || b <= 0) throw new Exception();

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
            System.out.println(a);

        }


    }



