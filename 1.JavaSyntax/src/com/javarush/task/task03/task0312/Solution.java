package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour) {
        int Sec;
        Sec = hour * 3600;
        return Sec;
    }


    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(6));
    }
}
