package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;


        while (i < 10) {
            i++;
            int j = 0;
            while (j < 10) {

                j++;
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


    }
}

