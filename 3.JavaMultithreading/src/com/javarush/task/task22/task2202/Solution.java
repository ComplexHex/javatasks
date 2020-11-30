package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

import java.lang.management.RuntimeMXBean;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String str = string;
        try {

            String[] words = str.split(" ");
            return String.format("%s %s %s %s", words[1], words[2], words[3], words[4]);
        } catch (Exception e) {
            if (str == string) {
                throw new TooShortStringException();
            }
        }return str;
    }


    public static class TooShortStringException extends RuntimeException {
    }
}
