package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while (true) {
            str = reader.readLine();
            if (str.equals("exit")) {
                break;
            }
            try {
                if (str.contains(Character.toString('.'))) {
                    print(Double.parseDouble(str));
                    continue;
                }

                if (Integer.parseInt(str) >= 128 || (Integer.parseInt(str) <= 0)) {
                    print(Integer.parseInt(str));
                    continue;
                }
                if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128) {
                    print(Short.parseShort(str));
                    continue;
                }

            } catch (Exception e) {
                print(str);
                continue;
            }
        }
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
