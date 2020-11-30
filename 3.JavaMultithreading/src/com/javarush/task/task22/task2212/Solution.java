package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null)
            return false;
        int length = telNumber.replaceAll("\\D", "").length();
        String reg1 = "\\+\\d((\\d*\\(\\d{3}\\))?\\d*-?\\d+-?\\d*)\\d";
        String reg2 = "((\\d*\\(\\d{3}\\))?\\d*-?\\d+-?\\d*)\\d";
        boolean result = false;
        if (telNumber.matches("\\+.*") && length == 12)
            result = telNumber.matches(reg1) ? true : false;
        if (telNumber.matches("\\d.*|\\(.*") && length == 10)
            result = telNumber.matches(reg2) ? true : false;
        return result;
    }

    public static void main(String[] args) {

    }
}
