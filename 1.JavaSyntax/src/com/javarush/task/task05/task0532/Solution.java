package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long maximum = -911111111111111L;

        //напишите тут ваш код
        int i = Integer.parseInt(reader.readLine());

        if (i > 0) {
            for (int j = 0; j < i; j++) {
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader1.readLine());
                maximum = Math.max(a, maximum);
            }
            System.out.println((int) maximum);
        }


    }
}
